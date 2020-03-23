package com.mykyta.advertmicroservice.repositories;

import com.mykyta.advertmicroservice.entity.Advert;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends ReactiveElasticsearchRepository<Advert, Integer> {

}
