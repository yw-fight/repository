package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yw
 * @date 2020/6/3-15:27
 */
@Controller
public class MybatisController {
    @Autowired
    private UserMapper  userMapper;//报错是因为没有创建UserMapper ,启动时动态加载
    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryAllUser(){
        return  userMapper.queryUserList();
    }


}
