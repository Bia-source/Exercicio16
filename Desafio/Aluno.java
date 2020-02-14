package Desafio;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobreNome;
    private Integer codigo;

    public Aluno(String nome, String sobreNome, Integer codigo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigo.equals(aluno.codigo);
    }




}
