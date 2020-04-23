package com.automannn.myModule2.config;

import com.automannn.myModule2.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author automannn@163.com
 * @time 2020/4/23 17:28
 */
@Configuration
public class MyModule2Configurations {

    @Bean
    public MyBean myBean(){
        System.out.println("======Enable开启模块功能===");
        return new MyBean();
    }
}
