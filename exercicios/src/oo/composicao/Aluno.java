package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nomeAluno;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nomeAluno = nome;
	}
	
	void adicionarCurso(Curso nomeDoCurso) {
		this.cursos.add(nomeDoCurso);
		nomeDoCurso.alunos.add(this);
	}
	
	public String toString() {
		return this.nomeAluno;
	}
}
