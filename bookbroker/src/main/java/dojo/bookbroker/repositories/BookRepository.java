package dojo.bookbroker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dojo.bookbroker.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();
}