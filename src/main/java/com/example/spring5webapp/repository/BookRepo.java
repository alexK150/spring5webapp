package com.example.spring5webapp.repository;

import com.example.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
