package com.mateusnere.springtestcontainers;

import com.mateusnere.springtestcontainers.domain.Aluno;
import com.mateusnere.springtestcontainers.repository.AlunoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@Slf4j
class SpringTestcontainersApplicationTests {

	@Autowired
	private AlunoRepository alunoRepository;

	@Test
	void criarAlunos() {
		log.info("Iniciar criação de alunos...");
		alunoRepository.save(new Aluno(1L, "Nicholas", "+5561999009988", "nicholas@kimura.com"));
		alunoRepository.save(new Aluno(2L, "Gordon Ryan", "+5562988776655", "gordon@kimura.com"));
		var alunosCount = alunoRepository.findAll().size();
		log.info("Temos {} alunos cadastrados.", alunosCount);

		Assertions.assertEquals(2, alunosCount);
	}
}
