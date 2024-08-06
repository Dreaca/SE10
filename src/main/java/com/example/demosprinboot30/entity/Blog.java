package com.example.demosprinboot30.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Blog {
    @Id
    private int id;
    private String title;
    private String text;
    private String category;



}
