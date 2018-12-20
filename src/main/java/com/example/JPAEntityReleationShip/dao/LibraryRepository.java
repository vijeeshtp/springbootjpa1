package com.example.JPAEntityReleationShip.dao;

import com.example.JPAEntityReleationShip.model.Library;
import org.springframework.data.repository.CrudRepository;


public interface LibraryRepository extends CrudRepository<Library, Long> {

}