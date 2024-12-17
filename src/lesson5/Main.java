package lesson5;

public class Main {
    public static void main(String[] args) {

        Student petr = new Student("Петр", "Васильев");
        System.out.println(petr.returnNameSurname().toString());
        petr.printCountLesson();
        petr.countLesson = 10;
        petr.printCountLesson();

        Student vasil = new Student("Vasil", "Razamov", 35);
        System.out.println(vasil.returnNameSurname().toString());
        vasil.printCountLesson();

        Student vera = new Student("Vera", "Glazko", 25, 5);
        System.out.println(vera.returnNameSurname().toString());
        vera.printCountLesson();
    }
}