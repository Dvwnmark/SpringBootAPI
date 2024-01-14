package com.example.springbootapi.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor //constructor k tham so
@AllArgsConstructor // constructor full tham so
@Data
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;


}
