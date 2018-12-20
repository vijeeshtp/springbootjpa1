package com.example.JPAEntityReleationShip.dao;

import com.example.JPAEntityReleationShip.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {

}