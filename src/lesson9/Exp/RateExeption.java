package lesson9.Exp;

public class RateExeption extends RuntimeException{

    private String exeptionMessage;

    public RateExeption(String exeptionMessage) {
        this.exeptionMessage = exeptionMessage;
    }

    @Override
    public String getMessage() {
        return exeptionMessage;
    }
}
