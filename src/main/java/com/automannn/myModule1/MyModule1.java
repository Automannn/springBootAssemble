package com.automannn.myModule1;

import com.automannn.myModule2.annotations.EnableMyModule2;
import com.automannn.myModule2.annotations.EnableSomeAbility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author automannn@163.com
 * @time 2020/4/23 17:07
 */
@SpringBootApplication
@RestController
//@EnableMyModule2
//@EnableSomeAbility(isLinux = true)
public class MyModule1 {
    @GetMapping("/say")
    public String sayHello(){
        return "hello,world";
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyModule1.class);
        app.run();
    }
}
