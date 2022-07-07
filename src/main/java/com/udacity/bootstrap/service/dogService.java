package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.dogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface dogService {

    List<Dog> retrieveDogs();
    List<Dog> retrieveDogBreed();
    List<String> retrieveDogBreedById(Long id);
    List<String> retrieveDogAllNames();

}
