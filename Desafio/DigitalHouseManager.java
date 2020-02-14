package Desafio;

import Exercicio05.Lapis;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //criando listas de array para alunos, professores, cursos e matriculas
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professor = new ArrayList<>();
    List<Curso> curso = new ArrayList<>();
    List<Matricula> matricula = new ArrayList<>();

    // criando método para registrar um novo curso na lista de cursos
    public void registrarCurso(String nomeCurso, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso novoCurso = new Curso(nomeCurso, codigoDoCurso, quantidadeMaximaDeAlunos);
        curso.add(novoCurso);
    }

    //criando método para excluir um curso da lista de cursos
    public void excluirCurso(Integer codigoDoCurso) {
        for (Integer i = 0; i < curso.size(); i++) {
            if (curso.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                curso.remove(i);
            }
        }

    }


    // criando método para inserir um professor adjunto na lista de professores
    public void registrarProfessorAdjunto(String nomeDoProfessor, String sobreNome, Integer codigoDeProfessor, Integer quantidadeDeHoras) {
        ProfessoresAdjuntos novoProfessorADJ = new ProfessoresAdjuntos(nomeDoProfessor, sobreNome, codigoDeProfessor, quantidadeDeHoras);
        professor.add(novoProfessorADJ);
    }

    //criando método para inserir um professor titular na lista de professores
    public void registrarProfessorTitular(String nome, String sobreNome, String especialidade, Integer codigoDoProfessor) {
        ProfessoresTitulares novoProfessorTIT = new ProfessoresTitulares(nome, sobreNome, codigoDoProfessor, especialidade);
        professor.add(novoProfessorTIT);
    }

    // criando método para excluir um professor da lista de professores
    public void excluirProfessor(Integer codigoDeProfessor) {

        //percorrendo a lista de professores para remover o professor
        for (Integer i = 0; i < professor.size(); i++) {
            if (professor.get(i).getCodigoDeProfessor().equals(codigoDeProfessor)) {
                professor.remove(i);

            }
        }
    }

    //criando método para matricular aluno
    public void matricularAluno(String nome, String sobrenome, Integer codigoDoAluno) {
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoDoAluno);
        alunos.add(novoAluno);
        System.out.println("Matriculado o aluno: " + novoAluno);
    }

    //método para matricular aluno no curso
    public void matricularAlunoNoCurso(Integer codigoDoAluno, Integer codigoDoCurso) {
        Curso curso1 = null;
        Aluno aluno1 = null;
       //percorrendo a lista de cursos para verificar se o curso do parametro existe
        for (Integer i = 0; i < curso.size(); i++) {
            if (curso.get(i).getCodigoDoCurso().equals(codigoDoCurso)) {
                curso1 = curso.get(i);
                break;
            }
        }
        if (curso1 == null) {
            System.out.println("Curso não encontrado");
            return;
        }

        //percorrendo a lista de cursos para verificar se o aluno já é matriculado ou nao
        for (Integer x = 0; x < alunos.size(); x++) {
            if (alunos.get(x).getCodigoDoAluno().equals(codigoDoAluno)) {
                aluno1 = alunos.get(x);
                break;
            }
        }
        if (aluno1 == null) {
            System.out.println("Aluno não matriculado");

            return;
        }
       //caso o aluno nao seja aluno, utilizando método adicionar aluno para adicionar aluno no curso
        if (curso1.adicionarAluno(aluno1)){
           this.matricularAluno(aluno1.getNome(), aluno1.getSobreNome(),aluno1.getCodigoDoAluno());
            Matricula novaMatricula = new Matricula();

        }


    }




}