package Desafio;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoDoCurso;
    private ProfessoresTitulares professorTitular;
    private ProfessoresAdjuntos professoresAdjuntos;
    private Integer quantidadeMax;
    //criando listas de quantidade de alunos matriculados
    private List<Aluno> alunosMatriculados = new ArrayList<>();


    private boolean permissao;

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

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }


    //criando um método contrutor para a classe curso

    public Curso(String nome, Integer curso, Integer quantidadeMax) {
        this.nome = nome;
        this.codigoDoCurso = curso;
        this.quantidadeMax = quantidadeMax;
    }

    //criando um get/set para os atributos da classe nome e curso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCurso() {
        return codigoDoCurso;
    }

    public void setCurso(Integer curso) {
        this.codigoDoCurso = curso;
    }

    //sobrescrevendo o método equals para comparar o valor do curso

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return Objects.equals(nome, curso1.nome) &&
                codigoDoCurso.equals(curso1.codigoDoCurso);
    }

    //criando um método para adicionar aluno a lista


    public boolean adicionarAluno (Aluno umAluno){
        if (alunosMatriculados.size() < quantidadeMax){
            alunosMatriculados.add(umAluno);
            return true;
        }else{
            System.out.println("Permissão negada");
        }
      return false;
    }

    public void excluirAluno (Aluno umAluno){
        alunosMatriculados.remove(umAluno);
    }



}
