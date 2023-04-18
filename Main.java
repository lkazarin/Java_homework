import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(10000, 100, "Volkswagen");
        Car car2 = new Car(10000, 100, "Volkswagen");
    System.out.println(car1 == car2);
    System.out.println(car1.equals((car2)));

        DoubleArrayWorking array = new DoubleArrayWorking();
        array.insert(5.05);
        array.insert(2.34);
        array.insert(1.56);
        array.insert(7.12);
        System.out.println(array.toString());
        array.delete(1);
        System.out.println(array.toString());
        System.out.println(array.find(3));
        array.sort();
        System.out.println(array.toString());

        CharArrayWorking arraySymb = new CharArrayWorking();
        arraySymb.insert('#');
        arraySymb.insert('%');
        arraySymb.insert('*');
        arraySymb.insert('@');
        System.out.println(arraySymb.toString());
        arraySymb.delete(1);
        System.out.println(arraySymb.toString());
        System.out.println(arraySymb.find('^'));
        arraySymb.sort();
        System.out.println(arraySymb.toString());
    }
}