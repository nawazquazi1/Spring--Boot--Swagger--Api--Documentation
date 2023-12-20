package com.nawaz.spring.boot.service;

import com.javatechie.spring.swagger.api.dao.BookRepository;
import com.javatechie.spring.swagger.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book.getBookId();
	}

	public Book getBook(int bookId) {
		return repository.findOne(bookId);
	}

	public List<Book> removeBook(int bookId) {
		repository.delete(bookId);
		return repository.findAll();
	}
}
