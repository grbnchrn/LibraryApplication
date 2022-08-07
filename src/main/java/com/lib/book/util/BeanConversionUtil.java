package com.lib.book.util;

import com.lib.book.dto.BookDto;
import com.lib.book.entity.Book;
import org.springframework.beans.BeanUtils;

public class BeanConversionUtil {

    public static BookDto getBookDtoFromBook(Book book){
        BookDto bookDto = new BookDto();
        System.out.println(book.getId());
        BeanUtils.copyProperties(book,bookDto);
        return bookDto;
    }
}
