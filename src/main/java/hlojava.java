package com.kashyap.demo.girl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
 public class hlojava {
    @RequestMapping("/hlo")
    public String sayhello(){

        return "hello java spring boot";
    }

    @RequestMapping("/hi")
    public String hello(){

        return "hello java";
    }
}










