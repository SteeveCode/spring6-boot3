package com.brexson.spring6boot3.examples.a0;

import com.brexson.spring6boot3.examples.a1.DepInjectionLauncherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }

    }
}

