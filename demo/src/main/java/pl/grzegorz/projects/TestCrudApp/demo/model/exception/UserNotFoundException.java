package pl.grzegorz.projects.TestCrudApp.demo.model.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);

    }
}
