package com.whiteledger.controller.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whiteledger.domain.cms.Place;
import com.whiteledger.repository.cms.PlaceRepository;

@Controller
@RequestMapping("/place")
public class PlaceController extends BaseController<Place, Long> {

    @Autowired
    public PlaceController(PlaceRepository repo) {
        super(repo);
    }
}