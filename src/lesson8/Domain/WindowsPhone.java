package lesson8.Domain;

public class WindowsPhone extends Phone{

    @Override
    public void firmware(int version) {
        System.out.println("WindowsPhone version: " + version);
    }

    @Override
    public void call(int number) {
        super.call(number);
        System.out.println("переделан вызов на телефоне");
    }
}
