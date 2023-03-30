import java.util.Scanner;

public class Main {
    static boolean globalBoolean;
    static byte globalByte;
    static short globalShort;
    static int globalInt;
    static long globalLong;
    static float globalFloat;
    static double globalDouble;
    static char globalChar;

    public static void main(String[] args) {
        boolean localBoolean;
        byte localByte;
        short localShort;
        int localInt;
        long localLong;
        float localFloat;
        double localDouble;
        char localChar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите булевое значение: ");
        localBoolean = scanner.nextBoolean();
        System.out.print("Введите значение byte: ");
        localByte = scanner.nextByte();
        System.out.print("Введите значение short: ");
        localShort = scanner.nextShort();
        System.out.print("Введите значение Int: ");
        localInt = scanner.nextInt();
        System.out.print("Введите значение Long: ");
        localLong = scanner.nextLong();
        System.out.print("Введите значение Float: ");
        localFloat = scanner.nextFloat();
        System.out.print("Введите значение Double: ");
        localDouble = scanner.nextDouble();
        System.out.print("Ввдеите значение Char:");
        localChar = scanner.next().charAt(0);

        System.out.println("Type\t\tGlobal\tLocal");
        System.out.println("boolean\t\t" + globalBoolean + "\t" + localBoolean);
        System.out.println("byte\t\t" + globalByte + "\t" + localByte);
        System.out.println("short\t\t" + globalShort + "\t" + localShort);
        System.out.println("int\t\t" + globalInt + "\t" + localInt);
        System.out.println("long\t\t" + globalLong + "\t" + localLong);
        System.out.println("float\t\t" + globalFloat + "\t" + localFloat);
        System.out.println("double\t\t" + globalDouble + "\t" + localDouble);
        System.out.println("char\t\t" + globalChar + "\t" + localChar);

        System.out.printf("%s \t %-8b %-8d %-8d %-14d %-14d %-14.4f %-14.4f %c\n",
                "Values:", globalBoolean, globalByte, globalShort, globalInt, globalLong, globalFloat, globalDouble, globalChar);
    }
}