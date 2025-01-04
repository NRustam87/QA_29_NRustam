package lesson9.Service;

import lesson9.Domain.User;
import lesson9.Exp.NumberExeption;
import lesson9.Exp.RateExeption;

import java.util.Random;

public class ValidateService {

    public void validate(User user, int rate) throws RateExeption {

        if (rate > user.getSumm()) {
            throw new RateExeption("Error. The bid must exceed the remaining amount on the account");
        } else if (rate > 100)
            throw new RateExeption("Error. The bid must be less than 100");
    }

    public boolean play(int number) {
        var random = new Random();
        int randomNumber = random.nextInt(6);
        System.out.println(randomNumber);
        if (number <= 5 && number >= 0) {
            if (randomNumber == number)
                return true;
            else
                return false;
        }
        else{
            throw new NumberExeption("Error. The number must be in the range from 0 to 5");
        }
    }

    public void change(User user, int rate, boolean result) {

        if (result) {
            user.setSumm(user.getSumm() + rate);
        } else {
            user.setSumm(user.getSumm() - rate);
        }
    }
}
