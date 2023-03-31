package assessment2;

public class InvalidSelectionException extends Exception{
	
	public InvalidSelectionException(String s) {
		super(s);
	}
	
	static void validateSelection(int x, int y, int z) throws InvalidSelectionException{
		if(x<y || x>z) {
			throw new InvalidSelectionException("\nPlease make a valid selection");
		}
	}
	
}
