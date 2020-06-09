package com.itheima.springboot_jpa;

/**
 * @author yw
 * @date 2020/6/3-17:14
 */

import com.itheima.springboot_jpa.domain.User;
import com.itheima.springboot_jpa.resposity.UserRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = SpringbootJpaApplication.class)
public class JpaTest {
    @Autowired
    private UserRespository userRespository;
    @Test
    public  void testJpa(){
    List<User> all=userRespository.findAll();
     System.out.println(all);
    }
}
