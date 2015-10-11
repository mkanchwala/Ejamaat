package com.whiteledger;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.format.datetime.joda.DateTimeFormatterFactory;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import com.fasterxml.jackson.datatype.joda.ser.JacksonJodaFormat;
import com.whiteledger.domain.cms.BaseBean;
import com.whiteledger.domain.cms.PolymorphicBaseBean;

@SpringBootApplication
@ImportResource("classpath*:app-context.xml")
public class WhiteLedgerApp extends SpringBootServletInitializer {
	
    @Bean
    public JodaModule jacksonJodaModule() {
        JodaModule module = new JodaModule();
        DateTimeFormatterFactory formatterFactory = new DateTimeFormatterFactory();
        formatterFactory.setPattern("yyyy-MM-dd HH:mm:ss");
        module.addSerializer(DateTime.class, new DateTimeSerializer(new JacksonJodaFormat(formatterFactory.createDateTimeFormatter().withZoneUTC())));
        return module;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.addMixInAnnotations(BaseBean.class, PolymorphicBaseBean.class);
        jsonConverter.setObjectMapper(objectMapper);
        return jsonConverter;
    }
    
    @Bean
    public BufferedImageHttpMessageConverter bufferedImageHttpMessageConverter() {
    	BufferedImageHttpMessageConverter imageConverter = new BufferedImageHttpMessageConverter();
        return imageConverter;
    }
    
    @Bean
    protected ResourceHttpRequestHandler faviconRequestHandler() {
        ResourceHttpRequestHandler requestHandler = new ResourceHttpRequestHandler();
        return requestHandler;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WhiteLedgerApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WhiteLedgerApp.class, args);
    }
}