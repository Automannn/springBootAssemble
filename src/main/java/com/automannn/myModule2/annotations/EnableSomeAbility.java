package com.automannn.myModule2.annotations;

import com.automannn.myModule2.config.AbilitySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({AbilitySelector.class})
public @interface EnableSomeAbility {
    boolean isLinux() default  false;
}
