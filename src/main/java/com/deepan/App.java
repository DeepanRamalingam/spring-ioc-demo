package com.deepan;

import com.deepan.config.AccountAppBeanConfig;
import com.deepan.model.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring IOC Demo" );
        System.out.println("===================");
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        ApplicationContext context = new AnnotationConfigApplicationContext(AccountAppBeanConfig.class);

        Account account = context.getBean("defaultAccount",Account.class);
        System.out.println(account);


    }
}


//create a application context (ioc container) from the specifications provided in a xml file located in the class path (xml based)
//create a context using the specifications provided in the java class (java based)


//eager loading

//old code for reference
//==========================


// Account accountOne = new Account();
//        Account accountTwo = new Account(12002,"Trichy","DBS",12000.0);
//        accountOne.setAccNo(12001);
//        accountOne.setBalance(2000.0);
//
//        System.out.println(accountOne);
//        System.out.println(accountTwo);