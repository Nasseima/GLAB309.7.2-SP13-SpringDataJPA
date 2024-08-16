package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Data
@Entity
@Table
@NoArgsConstructor
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private Long accountNo;
    private Long marks;
}


