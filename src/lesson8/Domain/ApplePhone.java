package lesson8.Domain;

public class ApplePhone extends Phone{

    @Override
    public void firmware(int version) {
        System.out.println("Iphone version: " + version);
    }
}
