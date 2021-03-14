package com.hello.hellospring;

import com.hello.hellospring.repository.MemberRepository;
import com.hello.hellospring.repository.MemoryMemberRepository;
import com.hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//스프링에서 빈을 찾을 때 빈을 주입해줌
@Configuration
public class SpringConfig {

    //스프링 컨테이너에 빈을 올림
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    //스프링 컨테이너에 빈을 올림
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
