package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.Book;

import java.util.List;

/**
 * @author d.grushetskiy
 */
public interface BookService {
    List<Book> findAll();

    Book findOne(Long id);

    List<Book> findByCategory(String category);

    List<Book> blurrySearch(String title);
}
