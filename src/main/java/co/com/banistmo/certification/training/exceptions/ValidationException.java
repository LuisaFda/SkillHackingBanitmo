package co.com.banistmo.certification.training.exceptions;

public class ValidationException extends AssertionError {

  public ValidationException(String message, Throwable cause) {
    super(message, cause);
  }

}
