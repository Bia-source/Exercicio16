package Desafio;

import java.util.Objects;

public class Professor {
    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codigoDeProfessor;

    //criando contrutor para a classe professor

    public Professor(String nome, String sobreNome, Integer tempoDeCasa, Integer codigoDeProfessor) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
    }

    /*fazendo get/set para inserir os valores e pegar o nome, sobreNome, tempoDeCasa, codigoDoProfessor
    para quando chamadas as funções devido ao private */
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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(Integer codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }

    //comparando se o codigo dos professores é igual ou nao
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoDeProfessor.equals(professor.codigoDeProfessor);
    }

}
