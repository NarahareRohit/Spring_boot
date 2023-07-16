package custom_exception;

@SuppressWarnings("serial")
public class ResourseNotFoundException extends Exception{
	public ResourseNotFoundException(String msg) {
		super(msg);
	}
}
