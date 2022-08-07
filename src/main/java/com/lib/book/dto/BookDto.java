package com.lib.book.dto;

import com.lib.book.common.PublishedDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    public BigInteger id;
    public String title;
    public String isbn;
    public int pageCount;
    public PublishedDate publishedDate;
    public String thumbnailUrl;
    public String shortDescription;
    public String longDescription;
    public String status;
    public ArrayList<String> authors;
    public ArrayList<String> categories;
}
