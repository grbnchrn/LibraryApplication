package com.lib.book.controller;

import com.lib.book.dto.BookDto;
import com.lib.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public Flux<BookDto> getAllBooks(){
        return bookService.getAllBookList();
    }

    @GetMapping("/{id}")
    public Mono<BookDto> getBook(@PathVariable Integer id){
        return  bookService.getBook(id);
    }
}
