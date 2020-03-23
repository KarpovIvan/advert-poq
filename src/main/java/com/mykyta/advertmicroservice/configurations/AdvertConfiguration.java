package com.mykyta.advertmicroservice.configurations;

import com.mykyta.advertmicroservice.repositories.AdvertRepository;
import com.mykyta.advertmicroservice.services.AdvertService;
import com.mykyta.advertmicroservice.services.impl.AdvertServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
public class AdvertConfiguration {


    @Bean
    public AdvertService advertService(AdvertRepository advertRepository){
        return new AdvertServiceImpl(advertRepository);
    }
}
