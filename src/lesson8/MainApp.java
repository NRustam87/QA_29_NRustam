package lesson8;

import lesson8.Domain.AndroidPhone;
import lesson8.Domain.ApplePhone;
import lesson8.Domain.Phone;
import lesson8.Domain.WindowsPhone;
import lesson8.Service.PhoneService;

public class MainApp {
    public static void main(String[] args) {

        ApplePhone iphone = new ApplePhone();
        AndroidPhone android = new AndroidPhone();
        PhoneService service = new PhoneService();

        service.check(iphone, 123123, 15, 2);

        service.check(android, 678678, 10, 3);

        Phone WindowsPhone = new WindowsPhone();

        service.check(WindowsPhone, 567567, 8, 4);

        Phone testPhone = new Phone() {
            @Override
            public void firmware(int version) {

            }
        };

        service.check(testPhone, 777777, 0123, 100);

    }
}