package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
