package com.mkanchwala.ejamaat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkanchwala.ejamaat.domain.Sabeel;
import com.mkanchwala.ejamaat.repository.SabeelRepository;

@Controller
@RequestMapping("/sabeel")
public class SabeelController extends RESTController<Sabeel, Long> {

    @Autowired
    public SabeelController(SabeelRepository repo) {
        super(repo);
    }
}