package pack;

public class MaxGroupSizeException extends Exception {

	@Override
	public String getMessage() {
		return "Too much students in one group";
	}
	

}
