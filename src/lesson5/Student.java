package lesson5;

import org.w3c.dom.ls.LSOutput;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int countLesson;

    public Student(String name, String surname){
        this.surname = surname;
        this.name = name;
    }

    public Student(String name, String surname, int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public Student(String name, String surname, int age, int countLesson){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.countLesson = countLesson;
    }

    public String returnNameSurname (){
      return  (this.surname + " " + this.name);
    }

    public void printCountLesson(){
        System.out.println(this.surname + " посещает " + this.countLesson + " занятий" );
    }
}
