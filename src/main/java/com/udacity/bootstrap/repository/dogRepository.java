package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface dogRepository extends CrudRepository<Dog, Long> {

    @Query(value = "SELECT d.id, d.breed FROM dog d", nativeQuery = true)
    List<Dog> findByBreed();

    @Query(value = "SELECT d.id, d.breed FROM dog d WHERE d.id=?1", nativeQuery = true)
    List<String> findBreedById(Long id);

    @Query(value = "SELECT d.id, d.names FROM dog d", nativeQuery = true)
    List<String> findAllNames();

}
