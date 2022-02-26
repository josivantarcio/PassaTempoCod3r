package excecao.excecaoRuntimeException;

@SuppressWarnings("serial")
public class ValidNameException extends RuntimeException{
	
	private String validName;

	public ValidNameException(String validName) {
		this.validName = validName;
	}
	
	public String getMessage() {
		return String.format("Campo com '%s' errado", validName);
	}
	
}
