package com.mensageria;



import com.mensageria.dao.AlunoDAO;
import com.mensageria.model.Alunos;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();
        Alunos aluno = new Alunos();
        /*
        aluno.setNome("Socorro de Deus");
        aluno.setSexo("feminino");
        aluno.setMaioridade(true);
        aluno.setTelefone("2345678");
        aluno.setCurso(Cursos.ADS);


        AlunoDAO dao = new AlunoDAO();
        dao.create(aluno);

        aluno.setNome("Amanda");
        aluno.setSexo("feminino");
        aluno.setMaioridade(true);
        aluno.setTelefone("555666777");
        aluno.setCurso(Cursos.ECMP);
        dao.create(aluno);
        */

        Optional<Alunos> a = dao.findById(3l);

        System.err.println(a.get().getNome());

        List<Alunos> alunos = dao.findAll();
        System.err.println("----------------------------------");
        for (Alunos aluno1 : alunos) {
            System.out.println(aluno1.getNome());
        }


    }
}