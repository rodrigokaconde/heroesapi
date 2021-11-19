package com.rfoliveira.heroesapi.service;

import com.rfoliveira.heroesapi.document.Heroes;
import com.rfoliveira.heroesapi.repository.HeroesRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService {

    private final HeroesRepository heroesRepository;

    public HeroesService(HeroesRepository heroesRepository){
        this.heroesRepository = heroesRepository;
    }

    public Flux<Heroes> findAll(){
        return Flux.fromIterable(this.heroesRepository.findAll());
    }

    public Mono<Heroes> findById(String id){
        return Mono.justOrEmpty(this.heroesRepository.findById(id));
    }

    public Mono <Heroes> save (Heroes heroes){
        return Mono.justOrEmpty(this.heroesRepository.save(heroes));
    }

    public Mono <Boolean> deleteByIdHero(String id){
        heroesRepository.deleteById(id);
        return Mono.just(true);
    }
}
