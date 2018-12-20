package com.example.JPAEntityReleationShip.dao;

import com.example.JPAEntityReleationShip.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {}
