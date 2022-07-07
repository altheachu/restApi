package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.dogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class dogServiceImpl implements dogService {

    @Autowired
    dogRepository DogRepository;

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>)DogRepository.findAll();
    }

    @Override
    public List<Dog> retrieveDogBreed() {
        return DogRepository.findByBreed();
    }

    @Override
    public List<String> retrieveDogBreedById(Long id) {
        return DogRepository.findBreedById(id);
    }

    @Override
    public List<String> retrieveDogAllNames() {
        return DogRepository.findAllNames();
    }
}
