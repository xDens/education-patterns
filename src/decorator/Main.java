package decorator;

public class Main {

    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
    }
}
