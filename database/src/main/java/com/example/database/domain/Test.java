package com.example.database.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TEST_USR")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "usr_key")
    String userKey;

    @Column(name = "pwd")
    String password;
}
