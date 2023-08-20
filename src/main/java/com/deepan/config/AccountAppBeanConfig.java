package com.deepan.config;

import com.deepan.model.Account;
import com.deepan.model.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.deepan")
public class AccountAppBeanConfig {

}

// <bean id="accountOne"  class="com.deepan.model.Account">
/// <bean id="address"  class="com.deepan.model.Address">
////
////    </bean>
//    </bean>


//xml config
//java config
//annotations ---  declarative approach


//    @Bean(value = "accountOne")
//    public Account getAccountOne() {
//
//        Account account = new Account(120012, "Trichy", "OCBC", 1200.12);
//        return account;
//    }
//
//    @Bean(value = "addressOne")
//    public Address getAddress() {
//        return new Address(123, "Trichy", "India");
//    }
//
//    @Bean(value = "addressTwo")
//    @Primary
//    public Address getAddressTwo() {
//        return new Address(999, "Chennai", "India");
//    }

//spring boot