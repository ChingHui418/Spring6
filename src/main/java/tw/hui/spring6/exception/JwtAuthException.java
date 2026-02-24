package tw.hui.spring6.exception;

public class JwtAuthException extends RuntimeException {
	public JwtAuthException(String mesg) {
		super(mesg);
	}
}
