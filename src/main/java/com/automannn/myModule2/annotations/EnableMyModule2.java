package com.automannn.myModule2.annotations;

import com.automannn.myModule2.config.MyModule2Configurations;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author automannn@163.com
 * @time 2020/4/23 17:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({MyModule2Configurations.class})
public @interface EnableMyModule2 {
}
