package com.udacity.bootstrap.web;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.service.dogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dogController {

    private dogService DogService;

    public void setDogService(dogService dogService) {
        this.DogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> list = DogService.retrieveDogs();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<Dog>> getAllDogBreed(){
        List<Dog> list = DogService.retrieveDogBreed();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<List<String>> getBreedById(@PathVariable Long id){
        List<String> breed = DogService.retrieveDogBreedById(id);
        return new ResponseEntity<List<String>>(breed, HttpStatus.OK);
    }

    public ResponseEntity<List<String>> getAllDogName(){
        List<String> list = DogService.retrieveDogAllNames();
        return new ResponseEntity<List<String>>(list,HttpStatus.OK);
    }

}
