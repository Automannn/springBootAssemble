package com.automannn.myModule2.config;

import com.automannn.myModule2.annotations.EnableSomeAbility;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author automannn@163.com
 * @time 2020/4/23 21:27
 */
public class AbilitySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> annotationAttributes =
                annotationMetadata.getAnnotationAttributes(EnableSomeAbility.class.getName());
        Boolean isLinux= (Boolean) annotationAttributes.get("isLinux");
        return new String[]{isLinux?
                Ability4Envir_1.class.getName():
                Ability4Envir_2.class.getName()};
    }
}
