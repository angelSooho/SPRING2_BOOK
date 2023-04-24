package com.mysite.sbb.Something.Builder;

public class MemberBuilder {

    private String name;
    private Long age;
    private String address;

    public MemberBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MemberBuilder setAge(Long age) {
        this.age = age;
        return this;
    }

    public MemberBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Member build() {
        return new Member(name, age, address);
    }
}
