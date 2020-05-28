package com.itheima.springboot_quick2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yw
 * @date 2020/5/28-14:39
 */
@RestController
public class ControllerQuick {
    @RequestMapping("/quick2")
    public  String quick(){
        return "springBoot 环境创建";
    }
}
