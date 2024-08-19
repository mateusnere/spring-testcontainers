package com.mateusnere.springtestcontainers.controller;

import com.mateusnere.springtestcontainers.domain.dto.AlunoDTO;
import com.mateusnere.springtestcontainers.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoDTO> novoAluno(@RequestBody AlunoDTO aluno) {
        alunoService.novoAluno(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }

    @GetMapping
    public ResponseEntity<List<AlunoDTO>> todosAlunos() {
        var alunos = alunoService.todosAlunos();

        return !alunos.isEmpty() ? ResponseEntity.ok(alunos) : ResponseEntity.noContent().build();
    }
}
