package com.hello.hellospring.controller;

import com.hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //생성자를 통해서 주입 권장
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //세터 인젝션 : 퍼블릭으로 노출이 되기 때문에 비 추천
    /*@Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    //필드주입 별로 좋지 않음
//    @Autowired private MemberService memberService;


}
