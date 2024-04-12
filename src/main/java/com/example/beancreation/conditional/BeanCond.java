package com.example.beancreation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanCond implements Condition {
    private static boolean conditionFlag = true;
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return conditionFlag;
    }
    public static void setConditionFlag(boolean flag) {
        conditionFlag = flag;
    }
}
