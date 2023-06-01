package hw.task01;

public class Person {

    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println("такой-то person двигается");
    }

    void talk() {
        System.out.println("такой-то person говорит");
    }
}