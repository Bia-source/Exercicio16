package Desafio;

import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;

    public Matricula(Aluno aluno, Curso curso, Date dataMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = new Date();
    }

    public Matricula() {

    }
}
