package ru.gothmog.bookstore.domain;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

/**
 * @author d.grushetskiy
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private String language;
    private String category;
    private int numberOfPages;
    private String format;
    private int isbn;
    private double shippingWeight;
    private double listPrice;
    private double ourPrice;
    private boolean active=true;

    @Column(columnDefinition="text")
    private String description;
    private int inStockNumber;

    @Transient
    private MultipartFile bookImage;
}
