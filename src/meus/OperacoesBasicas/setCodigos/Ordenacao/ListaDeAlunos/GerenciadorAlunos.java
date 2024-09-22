package meus.OperacoesBasicas.setCodigos.Ordenacao.ListaDeAlunos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorAlunos {

    Set<Alunos> alunosList ;

    public GerenciadorAlunos() {
        this.alunosList = new HashSet<>();
    }

    public void adicionarAlunos(String nome, int matricula, double nota){
        alunosList.add(new Alunos(nome,matricula,nota));
    }

    public void removerAlunos(){}


}
