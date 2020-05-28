package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yw
 * @date 2020/5/9
 */
//声明该类是一个springBoot的引导类，标注在哪个类上哪个就是引导类，都可以启动可以不和main方法写到一起
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args){
        //main方法，表示运行SpringBoot的引导类，run参数就是SpringBoot引导类的字节码对象
       SpringApplication.run(MySpringBootApplication.class);
    }
}
