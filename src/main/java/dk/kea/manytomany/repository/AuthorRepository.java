package dk.kea.manytomany.repository;

import dk.kea.manytomany.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
