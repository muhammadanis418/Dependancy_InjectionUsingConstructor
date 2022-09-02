package com.example.dependancy_injectionusingconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student st1 = applicationContext.getBean("h", Student.class);
        st1.displayInfo();

        Student s2 = applicationContext.getBean("m",Student.class);
        s2.displayInfo();
    }
}
