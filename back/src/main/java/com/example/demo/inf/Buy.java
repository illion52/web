package com.example.demo.inf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "buy")
@ToString
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Buy{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private int book_id;
    private float price;
    private String date;
    private String bookinf;


}

