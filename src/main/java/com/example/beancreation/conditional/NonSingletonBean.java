package com.example.beancreation.conditional;

public class NonSingletonBean {
    public NonSingletonBean() {
        System.out.println("Non Singleton Bean with @Condition is initialized");
        BeanCond.setConditionFlag(true);

    }
    public void doSomething() {
        System.out.println("Non Singleton Bean created using @Conditional and doing something");
    }
}
