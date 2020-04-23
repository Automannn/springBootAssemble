package com.automannn.myModule2.annotations;

import com.automannn.myModule2.condition.EnvirCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:44
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({EnvirCondition.class})
public @interface ConditionOnEnvir {
    String value();
}
