package lab8;

public class NoPositiveElementsException extends RuntimeException{

    public NoPositiveElementsException() {
        super("Відсутні позитивні елементи в масиві");
    }
}
