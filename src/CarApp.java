public class CarApp {

    public static void main(String[] args) {
        Car car = new Car();
        car.setStart("starting");
        car.setAccelerating("accelerating");
        car.setSpeed(90);
        car.setStop("stopped");
        car.setColor("red");
        car.setModel("Porsche");
        car.displayVehicle();

        Car car2 = new Car();
        car2.setStart("starting");
        car2.setAccelerating("accelerating");
        car2.setSpeed(90);
        car2.setStop("stopped");
        car2.setColor("red");
        car2.setModel("Porsche");
        car2.displayVehicle();
    }


}
