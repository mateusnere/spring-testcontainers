package com.mateusnere.springtestcontainers.service.impl;

import com.mateusnere.springtestcontainers.domain.Aluno;
import com.mateusnere.springtestcontainers.domain.dto.AlunoDTO;
import com.mateusnere.springtestcontainers.repository.AlunoRepository;
import com.mateusnere.springtestcontainers.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    @Override
    public void novoAluno(AlunoDTO aluno) {
        var alunoEntity = new Aluno();
        BeanUtils.copyProperties(aluno, alunoEntity);

        alunoRepository.save(alunoEntity);
    }

    @Override
    public List<AlunoDTO> todosAlunos() {
        return alunoRepository
                .findAll()
                .stream()
                .map(aluno -> new AlunoDTO(aluno.getNome(), aluno.getTelefone(), aluno.getEmail()))
                .toList();
    }
}
