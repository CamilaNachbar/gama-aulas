package br.com.magalu.aulas.aula3.escola;

import java.util.List;

public class Turma {

    public Professor professor;
    public List<Aluno> alunos;

    public void AdicionarProfessor(Professor professor){
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
