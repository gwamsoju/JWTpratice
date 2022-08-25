package com.example.jwtpratice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    private int testCol;
    private String test_col2;
}
