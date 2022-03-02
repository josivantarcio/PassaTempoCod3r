package excecao.excecaoRuntimeException;

import streams.Aluno;

public class TestRunTimeException {
	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("João", 5);
			Validator.studant(aluno);
		} catch (ValidValueException | ValidNameException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("the end");
	}
}
