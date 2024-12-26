package lesson8.Domain;

public class AndroidPhone extends Phone{

    @Override
    public void firmware(int version) {
        System.out.println("Android version: " + version);
    }
}
