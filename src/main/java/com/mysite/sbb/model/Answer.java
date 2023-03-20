package com.mysite.sbb.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Answer extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long answer_id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    @ManyToOne
    private SiteUser author;

    @ManyToMany
    Set<SiteUser> voter;

    public Answer(String content, Question question, LocalDateTime localDateTime) {
        this.content = content;
        this.question = question;
        this.setCreate_date(localDateTime);
    }
}
