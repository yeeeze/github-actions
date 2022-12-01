package com.study.githubactions.user;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userId;

    @Column
    private String name;

    @Column
    private int age;

    public Users() {
    }

    public Users(long userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
