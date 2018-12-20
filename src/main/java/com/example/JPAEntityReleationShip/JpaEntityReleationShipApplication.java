package com.example.JPAEntityReleationShip;

import com.example.JPAEntityReleationShip.dao.AuthorRepository;
import com.example.JPAEntityReleationShip.dao.LibraryRepository;
import com.example.JPAEntityReleationShip.model.Author;
import com.example.JPAEntityReleationShip.model.Book;
import com.example.JPAEntityReleationShip.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaEntityReleationShipApplication  implements CommandLineRunner {

	@Autowired
	LibraryRepository libraryRepository;

	@Autowired
	AuthorRepository authorRepository;



	public static void main(String[] args) {

		SpringApplication.run(JpaEntityReleationShipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Author author1 = new Author();
		Book book1= new Book();
		Library library = new Library();

		author1.setName("Author");

		author1.getBooks().add(book1);


		book1.setIsbn("123");
		book1.setTitle("MyBook");
		book1.getAuthors().add(author1);



		library.setName("MyLibrary");
		library.getBooks().add(book1);

		authorRepository.save(author1);
		libraryRepository.save(library);

	}
}

