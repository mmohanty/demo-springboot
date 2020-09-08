package com.example.demo.controller;

import com.example.demo.model.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private HttpServletRequest request;

//    @PostMapping(value="/demo", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
//            "application/x-www-form-urlencoded;charset=UTF-8" })
//    public String hello(){
//        System.out.println(request.getParameter("mobileNo"));
//        return "hello";
//    }

    @PostMapping(value="/demo")
    public String hello(@RequestBody DemoModel model){
        System.out.println(request.getParameter("mobileNo"));
        return "hello";
    }
}
