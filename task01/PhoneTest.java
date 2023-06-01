package hw.task01;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone01 = new Phone("49143646435", "iPhone", 234.5);
        Phone phone02 = new Phone("45564564435", "Google", 214.5);
        Phone phone03 = new Phone("48143676435", "Samsung", 274.5);
        System.out.println();

        phone01.receiveCall();
        phone02.receiveCall();
        phone03.receiveCall();
    }
}
