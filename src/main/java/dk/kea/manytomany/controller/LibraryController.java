package dk.kea.manytomany.controller;

import dk.kea.manytomany.repository.AuthorRepository;
import dk.kea.manytomany.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LibraryController {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

    @GetMapping("author/{id}")
    public String showAuthor(@PathVariable("id") long id, Model model) {

        //findById returnerer optional som skal pakkes ud
        model.addAttribute("author", authorRepository.findById(id).get());

        return "author";
    }

    @GetMapping("book/{id}")
    public String showBook(@PathVariable("id") long id, Model model) {

        //findById returnerer optional som skal pakkes ud
        model.addAttribute("book", bookRepository.findById(id).get());

        return "book";

    }
}
