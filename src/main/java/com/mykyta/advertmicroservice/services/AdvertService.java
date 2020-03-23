package com.mykyta.advertmicroservice.services;

import com.mykyta.advertmicroservice.entity.Advert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AdvertService {

    Mono<Advert> getById(int id);

    Flux<Advert> findAll();

    Mono<Advert> save(Advert advert);
}
