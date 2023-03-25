package com.mysite.sbb.Builder;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public class Member {

    @NotNull
    private String name;

    @NotNull
    private Long age;

    @Column(nullable = false)
    private String address;


    public Member(String name, Long age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

