package dojo.booksapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dojo.booksapi.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    List<Book> findAll();

}
