package com.book.poq.advert.services;

import com.book.poq.advert.entity.Advert;
import com.book.poq.advert.entity.AdvertId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AdvertService {

    Mono<Advert> getById(int id);

    Mono<AdvertId> getByName(String name);

    Flux<Advert> findAll();

    Mono<Advert> save(Advert advert);
}
