package com.accountant.configs;


import com.accountant.entities.UserAccount;
import com.accountant.entities.Wallet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.accountant")
public class SpringConfig {

    @Bean
    public Wallet walletBean(){
        return new Wallet();
    }

    @Bean
    public UserAccount userAccountBean(){
        return new UserAccount();
    }

}


/*
    @Bean
    public Wallet walletBean(){
        return new Wallet();
    }

 */