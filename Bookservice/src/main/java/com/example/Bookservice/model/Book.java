package com.example.Bookservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String title;
    private  String author;
    private  String language;
    private  String price;
}

