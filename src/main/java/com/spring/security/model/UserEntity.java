package com.spring.security.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="User")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private String password;
    private Boolean active;
    private String roles;
}
