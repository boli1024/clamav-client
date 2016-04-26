package xyz.capybara.clamav.exceptions;

public class UnknownCommandException extends RuntimeException {

    public UnknownCommandException(String command) {
        super(String.format("The %s command is unknown", command));
    }
}