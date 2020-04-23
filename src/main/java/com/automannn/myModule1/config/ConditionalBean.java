package com.automannn.myModule1.config;

import com.automannn.myModule2.annotations.ConditionOnEnvir;
import com.automannn.myModule2.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:48
 */
@Configuration
@ConditionOnEnvir(value = "none")
public class ConditionalBean {

    @Bean
    public MyBean conditionBean(){
        System.out.println("======条件加载的bean===");
        return new MyBean();
    }
}
