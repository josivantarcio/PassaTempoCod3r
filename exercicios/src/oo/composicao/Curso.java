package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nomeCurso;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nomeDoCurso){
		this.nomeCurso = nomeDoCurso;
	}
	
	void adicionarAluno(Aluno nomeDoAluno) {
		this.alunos.add(nomeDoAluno);
		nomeDoAluno.cursos.add(this);
	}
	
	public String toString() {
		return this.nomeCurso;
	}
}
