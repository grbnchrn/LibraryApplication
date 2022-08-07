package com.lib.book.entity;

import com.lib.book.common.PublishedDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Books")
public class Book {

    @Id
    public BigInteger id;
    public String title;
    public String isbn;
    public int pageCount;
    public PublishedDate date;
    public String thumbnailUrl;
    public String shortDescription;
    public String longDescription;
    public String status;
    public ArrayList<String> authors;
    public ArrayList<String> categories;
}