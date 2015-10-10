package com.mkanchwala.ejamaat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkanchwala.ejamaat.domain.Member;
import com.mkanchwala.ejamaat.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController extends RESTController<Member, Long> {

    @Autowired
    public MemberController(MemberRepository repo) {
        super(repo);
    }
}
