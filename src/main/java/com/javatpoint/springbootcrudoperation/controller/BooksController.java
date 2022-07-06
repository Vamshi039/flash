package com.javatpoint.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.springbootcrudoperation.model.Books;
import com.javatpoint.springbootcrudoperation.service.BooksService;

@RestController
@RequestMapping("/test")
public class BooksController {

	@Autowired
	BooksService booksService;

	@GetMapping("/book")
	private List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}

	@GetMapping("/book/{bookId}")
	private Books getBooks(@PathVariable("bookId") int bookId) {
		return booksService.getBooksById(bookId);
	}

	@DeleteMapping("book/{bookId}")
	private void deleteBook(@PathVariable("bookId") int bookId) {
		booksService.delete(bookId);
	}

	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books.getBookId();
	}

	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
}
