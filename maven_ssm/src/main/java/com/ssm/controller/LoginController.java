package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.domain.Member;
import com.ssm.service.MemberService;

@Controller
public class LoginController {
    @Autowired
    MemberService memberServiceImpl;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        System.out.println("接收到请求 ，Hello");
        return "hello";
    }

    @RequestMapping(value = "/login")
    public String login(String name, String password){
        try {
            Member member = memberServiceImpl.login(name, password);
            if(member == null){
                System.out.println("登陆失败");
            }else {
                System.out.println("登陆成功");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("登录失败");
        }
        return null;
    }
}
