package com.whiteledger.controller.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whiteledger.domain.cms.Business;
import com.whiteledger.repository.cms.SabeelRepository;

@Controller
@RequestMapping("/business")
public class BusinessController extends BaseController<Business, Long> {

    @Autowired
    public BusinessController(SabeelRepository repo) {
        super(repo);
    }
}