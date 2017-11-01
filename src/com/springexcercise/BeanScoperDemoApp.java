package com.springexcercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScoperDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing to the same object " + result);
        System.out.println("memory location for the Coach" + theCoach);
        System.out.println("memory location for the Coach" + alphaCoach);
        context.close();
    }
}
