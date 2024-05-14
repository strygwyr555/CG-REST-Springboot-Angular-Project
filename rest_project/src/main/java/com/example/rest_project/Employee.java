package com.example.rest_project;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String dob;

    @Column(name = "ssn")
    private String lastFourSsn;
    // Getters and setters
    
    
}