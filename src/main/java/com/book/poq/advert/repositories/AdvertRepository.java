package com.book.poq.advert.repositories;

import com.book.poq.advert.entity.Advert;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertRepository extends ReactiveElasticsearchRepository<Advert, Integer> {

}
