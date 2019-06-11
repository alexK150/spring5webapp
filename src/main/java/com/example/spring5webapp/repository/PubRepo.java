package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PubRepo extends CrudRepository<Publisher, Long> {
}
