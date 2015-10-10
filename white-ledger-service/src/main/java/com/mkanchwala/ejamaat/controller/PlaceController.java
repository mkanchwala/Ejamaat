package com.mkanchwala.ejamaat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkanchwala.ejamaat.domain.Place;
import com.mkanchwala.ejamaat.repository.PlaceRepository;

@Controller
@RequestMapping("/place")
public class PlaceController extends RESTController<Place, Long> {

    @Autowired
    public PlaceController(PlaceRepository repo) {
        super(repo);
    }
}