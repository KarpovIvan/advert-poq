package com.mykyta.advertmicroservice.services.impl;

import com.mykyta.advertmicroservice.entity.Advert;
import com.mykyta.advertmicroservice.repositories.AdvertRepository;
import com.mykyta.advertmicroservice.services.AdvertService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AdvertServiceImpl implements AdvertService {

    protected AdvertRepository advertRepository;

    public AdvertServiceImpl(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @Override
    public Mono<Advert> getById(int id) {
        return advertRepository.findById(id);
    }

    @Override
    public Flux<Advert> findAll() {
        return advertRepository.findAll();
    }

    @Override
    public Mono<Advert> save(Advert advert) {
        return advertRepository.save(advert);
    }
}
