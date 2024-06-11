package com.myshop.renthistory.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RentHistoryFacadeConfiguration {


    @Bean
    RentHistoryFacade rentHistoryFacade (RentHistoryRepository rentHistoryRepository){
        RentHistoryService rentHistoryService = new RentHistoryService(rentHistoryRepository);
        return new RentHistoryFacade(rentHistoryService);
    }
}