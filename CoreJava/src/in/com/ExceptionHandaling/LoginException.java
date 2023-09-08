package in.com.ExceptionHandaling;

public class LoginException extends RuntimeException{
public LoginException() {
	
	super("invalid user");
}
}
