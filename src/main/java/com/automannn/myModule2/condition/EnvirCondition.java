package com.automannn.myModule2.condition;

import com.automannn.myModule2.annotations.ConditionOnEnvir;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:45
 */
public class EnvirCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext,
                           AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> annotationAttributes
                = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnEnvir.class.getName());
        String v= (String) annotationAttributes.get("value");
        return "automannn".equals(v);
    }
}
