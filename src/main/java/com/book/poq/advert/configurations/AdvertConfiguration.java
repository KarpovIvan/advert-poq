package com.book.poq.advert.configurations;

import com.book.poq.advert.repositories.AdvertRepository;
import com.book.poq.advert.services.AdvertService;
import com.book.poq.advert.services.impl.AdvertServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AdvertConfiguration {


    @Bean
    public AdvertService advertService(AdvertRepository advertRepository){
        return new AdvertServiceImpl(advertRepository);
    }
}
