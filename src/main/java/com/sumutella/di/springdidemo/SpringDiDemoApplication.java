package com.sumutella.di.springdidemo;

import com.sumutella.di.springdidemo.controllers.ConstructorInjectedController;
import com.sumutella.di.springdidemo.controllers.MyController;
import com.sumutella.di.springdidemo.controllers.PropertyInjectedController;
import com.sumutella.di.springdidemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiDemoApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.hello());

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

    }

}
