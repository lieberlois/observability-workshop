package com.github.olly.workshop.imageholder.service;


import com.github.olly.workshop.imageholder.model.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
interface ImageRepository extends MongoRepository<Image, String> {

    @Query(value = "{}", fields = "{ 'id' : 1, 'name' : 1 , 'contentType' : 1 , 'data' : 0 }")
    List<Image> findAllIds();
}