package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yw
 * @date 2020/5/9-16:47
 */
@Controller
public class QuickController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "你好 springBoot";
    }
}
