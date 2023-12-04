package com.gozde.dockercomposedemo.model;

import jakarta.persistence.*;
import lombok.Builder;


@Entity
@Table(name = "customer")
@Builder
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }
}
