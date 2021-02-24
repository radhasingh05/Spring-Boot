package com.radha.service;

import com.radha.model.Book;

public interface BookService {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id) throws InterruptedException;

    String deleteBook(long id);
}
