package dk.kea.manytomany.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    @ManyToMany(mappedBy = "books")
    Set<Author> authors;
}
