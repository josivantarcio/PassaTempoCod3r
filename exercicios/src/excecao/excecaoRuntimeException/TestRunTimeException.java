package excecao.excecaoRuntimeException;

import streams.Aluno;

public class TestRunTimeException {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("João", 5);
			Validator.studant(aluno);
		} catch (ValidValueException e) {
			System.out.println(e.getMessage());
		} catch (ValidNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("the end");
	}
}
