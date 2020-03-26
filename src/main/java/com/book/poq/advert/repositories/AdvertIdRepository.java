package com.book.poq.advert.repositories;

import com.book.poq.advert.entity.AdvertId;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AdvertIdRepository extends ReactiveElasticsearchRepository<AdvertId, Integer> {

    Mono<AdvertId> findFirstByName(String name);

}
