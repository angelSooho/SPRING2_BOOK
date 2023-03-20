package com.mysite.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/sbb")
    public String index() {
//        System.out.println("index");
//        return "index";
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
}