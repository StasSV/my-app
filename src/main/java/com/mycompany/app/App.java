package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main.xml");
        VolksWagen vw = (VolksWagen) applicationContext.getBean("vw");
        vw.beep();
        vw.people();
    }

}
