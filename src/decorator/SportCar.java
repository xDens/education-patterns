package decorator;

public class SportCar extends CarDecorator {

    public SportCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car");
    }
}
