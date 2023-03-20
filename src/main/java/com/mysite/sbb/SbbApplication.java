package com.mysite.sbb;

import com.mysite.sbb.model.Question;
import com.mysite.sbb.repository.QuestionRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

@EnableJpaAuditing
@SpringBootApplication
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

}
