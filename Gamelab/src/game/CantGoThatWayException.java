package game;

public class CantGoThatWayException extends RuntimeException{
	public CantGoThatWayException (String error) {
		super(error);
	}
	
}
