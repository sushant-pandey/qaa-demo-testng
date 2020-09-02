package testexceptions;

public class PendingTestStepException extends RuntimeException{

	public PendingTestStepException(String string) {
		System.out.println(string);
	}

	public PendingTestStepException() {
		System.out.println("Test Step not implemented");
	}
}
