package com.simer.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simer.springexample.PrintHello;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        PrintHello hlo=context.getBean(PrintHello.class);
        hlo.sayHello();
    }
}
