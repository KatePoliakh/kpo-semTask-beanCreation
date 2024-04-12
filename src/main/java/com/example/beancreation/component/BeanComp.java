package com.example.beancreation.component;

import org.springframework.stereotype.Component;

@Component
public class BeanComp {
    public void doSomething() {
        System.out.println("Bean created using component and doing something");
    }
}
