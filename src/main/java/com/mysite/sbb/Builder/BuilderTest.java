package com.mysite.sbb.Builder;

import com.mysite.sbb.Builder.Member;
import com.mysite.sbb.Builder.MemberBuilder;

public class BuilderTest {

    Member member2 = new Member("수호", 25L, "서울시");

    Member memberB = new MemberBuilder()
            .setName("수호")
            .setAge(26L)
            .setAddress("서울시")
            .build();

    Member member = Member.builder()
            .name("수호")
            .age(25L)
            .address("서울시")
            .build();
}
