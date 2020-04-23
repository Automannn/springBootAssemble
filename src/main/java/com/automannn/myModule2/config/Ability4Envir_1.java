package com.automannn.myModule2.config;

import com.automannn.myModule2.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:30
 */
@Configuration
public class Ability4Envir_1 {
    @Bean
    public MyBean envir_1(){
        System.out.println("======envir_1功能配置===");
        return new MyBean();
    }
}
