package core;

public abstract class PassengerCar implements Car {
    private int quantity;
    private String model;
    public static String var1 = "Пассажирские машины";
    PassengerCar sedan = new Sedan();

    public int getQuantity() {
        return quantity;
    }

    public String getModel() {
        return model;
    }
}
