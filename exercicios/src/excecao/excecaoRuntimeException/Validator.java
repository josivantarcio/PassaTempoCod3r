package excecao.excecaoRuntimeException;

import streams.Aluno;

public class Validator {
	public static void studant(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("Os campos do Aluno está nulo!");
		}
		
		if(aluno.getName() == null || aluno.getName().trim().isEmpty()) {
			throw new ValidNameException("nome");
		}
		
		if(aluno.getValue() < 0 || aluno.getValue() > 10) {
			throw new ValidValueException("valor"); 
		}
	}
}
