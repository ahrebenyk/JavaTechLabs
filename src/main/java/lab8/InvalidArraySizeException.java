package lab8;

public class InvalidArraySizeException extends RuntimeException{

    public InvalidArraySizeException(int size) {
        super("Некоректний розмір масиву: %s".formatted(size));
    }
}
