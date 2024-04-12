package com.example.beancreation.conditional;

public class ExampleBeanForCond {
    public ExampleBeanForCond(){
        System.out.println("Bean with @Condition is initialized");
        BeanCond.setConditionFlag(true);
    }
    public void doSomething() {
        System.out.println("Bean created using @Conditional doing something");
    }
}
