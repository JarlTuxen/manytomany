package dk.kea.manytomany.repository;

import dk.kea.manytomany.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
