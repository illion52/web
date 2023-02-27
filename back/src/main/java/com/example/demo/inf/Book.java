package com.example.demo.inf;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "book")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    // Title of the book.
    private String title;

    //Author name.
    private String author;

    //Publication date.
    private String date;


    //Press.
    private String press;

     //Abstract of the book.
    private String abs;

    //The url of the book's cover.
    private String cover;

    private float price;

    //Category 类别
    @ManyToOne
    @JoinColumn(name="cid")
    private Category category;
}
