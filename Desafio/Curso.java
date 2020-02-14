package Desafio;

import java.util.Objects;

public class Curso {
    private String nome;
    private Integer curso;

    public Curso(String nome, Integer curso) {
        this.nome = nome;
        this.curso = curso;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return Objects.equals(nome, curso1.nome) &&
                curso.equals(curso1.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso);
    }
}
