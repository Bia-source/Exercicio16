package Desafio;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer curso;
    private ProfessoresTitulares professorTitular;
    private ProfessoresAdjuntos professoresAdjuntos;
    private Integer quantidadeMax;

    // inserindo get e set Tipos de professores
    public ProfessoresTitulares getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessoresTitulares professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessoresAdjuntos getProfessoresAdjuntos() {
        return professoresAdjuntos;
    }

    public void setProfessoresAdjuntos(ProfessoresAdjuntos professoresAdjuntos) {
        this.professoresAdjuntos = professoresAdjuntos;
    }

    //criando listas de quantidade de alunos e alunos matriculados
    List<Aluno> quantidadeAlunos = new ArrayList<>();
    List<Aluno> alunosMatriculados = new ArrayList<>();

    //criando um método contrutor para a classe curso

    public Curso(String nome, Integer curso) {
        this.nome = nome;
        this.curso = curso;
    }

    //criando um get/set para os atributos da classe nome e curso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    //sobrescrevendo o método equals para comparar o valor do curso

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return Objects.equals(nome, curso1.nome) &&
                curso.equals(curso1.curso);
    }


}
