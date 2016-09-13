package assignment2;

public class NegativeAgeException extends RuntimeException {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please Enter A positive value. Age cannot be negative.";
	}
	
}
