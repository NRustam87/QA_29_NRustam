package lesson8.Service;

import lesson8.Domain.Phone;

public class PhoneService {

    private Phone phone;

    public void check(Phone phone, int testNumber, int version, int volume){
        phone.call(testNumber);
        phone.play(volume);
        phone.firmware(version);
        if(testNumber>0 && version>0 && volume>0) {
            System.out.println("Telephone OK");
        }
        else
            System.out.println("Telephone is broken");
    }
}
