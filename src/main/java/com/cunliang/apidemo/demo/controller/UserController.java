package com.cunliang.apidemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cunliang
 * @create：2021-06-10-3:19 下午
 */
@RestController
public class UserController {
    @RequestMapping("/abc")
    public Animal getName(){
        return new Animal("pangpang",3);
    }
}
