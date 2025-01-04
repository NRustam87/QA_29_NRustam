package lesson9;

import lesson9.Domain.User;
import lesson9.Exp.NumberExeption;
import lesson9.Exp.RateExeption;
import lesson9.Service.ValidateService;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Введите имя пользователя");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Введите желаемую сумму");
        int summ = scanner.nextInt();

        User user = new User(userName, summ);
        ValidateService service = new ValidateService();

        while (user.getSumm() > 0) {

            Scanner scannerUser = new Scanner(System.in);
            System.out.println("Введите ставку");
            int rate = scannerUser.nextInt();
            try {
                service.validate(user, rate);
            } catch (RateExeption e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Введите число от 0 до 5");
            int number;
            number = scannerUser.nextInt();
            if (number == -1) {
                System.out.println("Игра закончена");
                break;
            }
            boolean result = false;
            try {
                 result = service.play(number);
            } catch (NumberExeption e){
                System.out.println(e.getMessage());
                continue;
            }

            service.change(user, rate, result);
            System.out.println(user.getSumm().toString());
            if(user.getSumm() == 0){
                System.out.println("Ваш баланс 0, игра закончена");
                break;
            }
        }
    }
}

