package Desafio;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobreNome;
    private Integer codigoDoAluno;

    //criando construtor para a classe aluno
    public Aluno(String nome, String sobreNome, Integer codigo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoDoAluno = codigo;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodigoDoAluno() {
        return codigoDoAluno;
    }

    public void setCodigoDoAluno(Integer codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    // sobrescrevendo o método equals para comparar o codigo dos alunos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoDoAluno.equals(aluno.codigoDoAluno);
    }




}
