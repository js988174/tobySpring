package com.toby.spring.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class User {

    private String id;
    private String name;
    private String password;

}
