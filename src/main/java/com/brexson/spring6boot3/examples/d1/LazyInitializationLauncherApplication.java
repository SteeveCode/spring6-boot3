package com.brexson.spring6boot3.examples.d1;

import com.brexson.spring6boot3.examples.a1.DepInjectionLauncherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
    public void hi(){
        System.out.println("HelloWorld");
    }

}

@Component
@Lazy // suppress the initialization of the code inside classB
class ClassB {
    ClassA classA;
    public ClassB(ClassA classA) {
        // Logic
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("Do Something");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);){
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();

        }

    }
}

