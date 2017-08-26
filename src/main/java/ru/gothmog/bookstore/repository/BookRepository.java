package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.Book;

import java.util.List;

/**
 * @author d.grushetskiy
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);
}
