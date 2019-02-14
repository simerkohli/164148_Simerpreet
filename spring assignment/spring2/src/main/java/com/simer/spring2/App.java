package com.simer.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context=new ClassPathXmlApplicationContext("assignment2.xml");
       Question ques= context.getBean(Question.class);
      
       System.out.println(ques);
    }
}
