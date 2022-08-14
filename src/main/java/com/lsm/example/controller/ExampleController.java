package com.lsm.example.controller;

import bean.ReportOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ReportOperation reportOperation;

    @GetMapping("test")
    public String test() {
        System.out.println(reportOperation.getMsg());
        return reportOperation.getMsg();
    }
}