package com.whiteledger.controller.uam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whiteledger.controller.cms.BaseController;
import com.whiteledger.domain.uam.Member;
import com.whiteledger.repository.uam.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController extends BaseController<Member, Long> {

    @Autowired
    public MemberController(MemberRepository repo) {
        super(repo);
    }
}
