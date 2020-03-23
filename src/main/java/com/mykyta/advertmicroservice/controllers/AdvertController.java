package com.mykyta.advertmicroservice.controllers;

import com.mykyta.advertmicroservice.entity.Advert;
import com.mykyta.advertmicroservice.services.AdvertService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/advert")
public class AdvertController {

    protected AdvertService advertService;

    public AdvertController(AdvertService advertService) {
        this.advertService = advertService;
    }

    @GetMapping("/{id}")
    public Mono<Advert> getById(@PathVariable int id){
        return advertService.getById(id);
    }

    @GetMapping
    public Flux<Advert> findAll(){
        return advertService.findAll();
    }

    @PostMapping
    public Mono<Advert> save(@RequestBody Advert advert){
        return advertService.save(advert);
    }

    @PostMapping("/generate")
    public Flux<Advert> generate(@RequestParam("start") int s, @RequestParam("end") int e){
        return Flux.range(s,e)
                .flatMap(i -> advertService.save(new Advert(i, "Advert " + i)));
    }

}
