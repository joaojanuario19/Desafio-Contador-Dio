package resource;

public class ParametrosInvalidosException extends Exception {
	
	public ParametrosInvalidosException() {
		super("Parametros inválidos");
	}
	
	public ParametrosInvalidosException(String message) {
		super(message);
	}
}
