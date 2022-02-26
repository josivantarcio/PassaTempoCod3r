package excecao.excecaoRuntimeException;

@SuppressWarnings("serial")
public class ValidValueException extends RuntimeException{
	
	private String validValue;
	
	public ValidValueException(String validValue) {
		this.validValue = validValue;
	}
	
	@Override
	public String getMessage() {
		return String.format("O valor do campo '%s' está fora da faixa permitida!", validValue);
	}
}
