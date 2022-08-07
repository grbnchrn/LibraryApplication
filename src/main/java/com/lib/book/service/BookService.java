package com.lib.book.service;

import com.lib.book.dto.BookDto;
import com.lib.book.repository.BookRepository;
import com.lib.book.util.BeanConversionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Flux<BookDto> getAllBookList(){
        return bookRepository.findAll().map(BeanConversionUtil::getBookDtoFromBook);
    }

    public Mono<BookDto> getBook(Integer bookId){
        return bookRepository.findById(bookId).map(BeanConversionUtil::getBookDtoFromBook);
    }
}
