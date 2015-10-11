package com.whiteledger.domain.cms;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.whiteledger.domain.uam.Member;

@JsonTypeInfo(  
	    use = JsonTypeInfo.Id.NAME,  
	    include = JsonTypeInfo.As.PROPERTY,  
	    property = "objType")  
	@JsonSubTypes({  
		@Type(value = Place.class, name = "place"),  
		@Type(value = Business.class, name = "business"),
		@Type(value = Member.class, name = "member")
	})  
public abstract class PolymorphicBaseBean {

}
