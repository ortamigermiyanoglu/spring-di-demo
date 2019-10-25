package com.sumutella.di.springdidemo;

import com.sumutella.di.springdidemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiDemoApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        myController.hello();

    }

}
