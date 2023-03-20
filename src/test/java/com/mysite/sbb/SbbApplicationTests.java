package com.mysite.sbb;

import com.mysite.sbb.model.Answer;
import com.mysite.sbb.model.Question;
import com.mysite.sbb.repository.AnswerRepository;
import com.mysite.sbb.repository.QuestionRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired QuestionRepository questionRepository;
	@Autowired AnswerRepository answerRepository;

	@BeforeEach
	void anyway() {
		questionRepository.deleteAll();
	}

	@Test
	@DisplayName("객체 저장")
	void testJpa() {
		Question q1 = new Question("sbb가 무엇인가요?",
				"sbb에 대해서 알고 싶습니다.", LocalDateTime.now());
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
		questionRepository.save(q1);  // 첫번째 질문 저장
		Question findQuestion1 = questionRepository.findById(q1.getQuestion_id()).get();
		Assertions.assertThat(findQuestion1.getContent()).isEqualTo(q1.getContent());
		System.out.println("findQuestion1 = " + findQuestion1);
		System.out.println("q1 = " + q1);



		Question q2 = new Question("스프링부트 모델 질문입니다.",
				"id는 자동으로 생성되나요?", LocalDateTime.now());
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
		questionRepository.save(q2);  // 두번째 질문 저장
		Question findQuestion2 = questionRepository.findById(q2.getQuestion_id()).get();
		Assertions.assertThat(findQuestion2.getContent()).isEqualTo(q2.getContent());
	}

}
