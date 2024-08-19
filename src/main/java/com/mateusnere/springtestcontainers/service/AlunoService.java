package com.mateusnere.springtestcontainers.service;

import com.mateusnere.springtestcontainers.domain.dto.AlunoDTO;

import java.util.List;

public interface AlunoService {

    void novoAluno(AlunoDTO aluno);

    List<AlunoDTO> todosAlunos();
}
