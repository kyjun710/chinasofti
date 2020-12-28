package com.chinasofti.member.controller;

import com.chinasofti.common.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member/hello")
public class HelloController {

    @RequestMapping("/coupons")
    public R test(){
        return R.ok().put("hello","helloworld");
    }
}
