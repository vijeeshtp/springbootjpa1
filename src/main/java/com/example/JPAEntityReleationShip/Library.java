package com.example.JPAEntityReleationShip;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Library {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;


    @OneToMany(mappedBy = "library")
    private List<Book> books = new ArrayList<>();

    public Library() {
    }

    public Library(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}