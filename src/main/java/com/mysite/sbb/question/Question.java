package com.mysite.sbb.question;

import com.mysite.sbb.answer.model.Answer;
import com.mysite.sbb.base.BaseTimeEntity;
import com.mysite.sbb.security.SiteUser;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Question extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;

    @ManyToMany
    Set<SiteUser> voter;

    public Question(String subject, String content, LocalDateTime localDateTime) {
        this.subject = subject;
        this.content = content;
        this.setCreate_date(localDateTime);
    }
}

