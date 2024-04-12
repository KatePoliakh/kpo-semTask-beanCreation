package com.example.beancreation;

import com.example.beancreation.component.BeanComp;
import com.example.beancreation.conditional.BeanCond;
import com.example.beancreation.conditional.BeanCondConfig;
import com.example.beancreation.conditional.ExampleBeanForCond;
import com.example.beancreation.conditional.NonSingletonBean;
import com.example.beancreation.configurationBean.BeanConfig;
import com.example.beancreation.configurationBean.ExampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanCreationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BeanCreationApplication.class, args);

        // @Component
        BeanComp beanComp = context.getBean(BeanComp.class);
        beanComp.doSomething();


        // @Configuration + @Bean
        AnnotationConfigApplicationContext configContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ExampleBean exampleBean = configContext.getBean(ExampleBean.class);
        exampleBean.doSomething();

        // @Conditional
        AnnotationConfigApplicationContext configContextForCondition = new AnnotationConfigApplicationContext(BeanCondConfig.class);
        BeanCond BeanCondition = new BeanCond();
        if (BeanCondition.matches(null, null)) {
            ExampleBeanForCond bean = configContextForCondition.getBean(ExampleBeanForCond.class);
            bean.doSomething();
            NonSingletonBean nonSingletonBean = configContextForCondition.getBean(NonSingletonBean.class);
            nonSingletonBean.doSomething();
        } else {
            System.out.println("Conditional bean is not created.");
        }

        // Закрыть контексты
        context.close();
        configContext.close();
        configContextForCondition.close();
    }
}
