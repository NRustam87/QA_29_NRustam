package lesson9.Exp;

public class NumberExeption extends RuntimeException{

    private String messageExeption ;

    public NumberExeption(String messageExeption) {
        this.messageExeption = messageExeption;
    }

    @Override
    public String getMessage() {
        return messageExeption;
    }
}
