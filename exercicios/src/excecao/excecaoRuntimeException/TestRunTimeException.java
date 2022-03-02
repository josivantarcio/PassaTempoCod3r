package excecao.excecaoRuntimeException;

import streams.Aluno;

public class TestRunTimeException {
	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("João", 5);
			Validator.studant(aluno);
			
			Validator.studant(null);
		} catch (ValidValueException | ValidNameException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("the end");
	}
}
