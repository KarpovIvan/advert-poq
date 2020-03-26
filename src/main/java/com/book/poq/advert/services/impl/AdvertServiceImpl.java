package com.book.poq.advert.services.impl;

import com.book.poq.advert.entity.Advert;
import com.book.poq.advert.entity.AdvertId;
import com.book.poq.advert.repositories.AdvertIdRepository;
import com.book.poq.advert.repositories.AdvertRepository;
import com.book.poq.advert.services.AdvertService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AdvertServiceImpl implements AdvertService {

    protected AdvertRepository advertRepository;

    protected AdvertIdRepository advertIdRepository;

    public AdvertServiceImpl(AdvertRepository advertRepository, AdvertIdRepository advertIdRepository) {
        this.advertRepository = advertRepository;
        this.advertIdRepository = advertIdRepository;
    }

    @Override
    public Mono<AdvertId> getByName(String name) {
        return advertIdRepository.findFirstByName(name);
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
