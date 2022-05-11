package main.java.model.exception;

public class TeamIsAlreadyFullException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public TeamIsAlreadyFullException(String errorMessage) {
        super(errorMessage);
    }
}