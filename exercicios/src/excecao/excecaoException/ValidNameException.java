package excecao.excecaoException;

@SuppressWarnings("serial")
public class ValidNameException extends Exception{
	
	private String validName;

	public ValidNameException(String validName) {
		this.validName = validName;
	}
	
	public String getMessage() {
		return String.format("Campo com '%s' errado", validName);
	}
	
}
