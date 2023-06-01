package hw.task01;

public class Phone {
    private String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall() {
        System.out.println("Звонит Leo");
    }

    public String getNumber() {
        return number;
    }

    }
