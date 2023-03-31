package assessment2;

public class BlankInputFieldException extends Exception{

	public BlankInputFieldException(String s) {
		super(s);
	}
	
	static void checkIfEmpty(String s) throws BlankInputFieldException{
		if(s.trim().equals("")) {
			throw new BlankInputFieldException("Input cannot be empty");
		}
	}
	
}
