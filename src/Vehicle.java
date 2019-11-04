public class Vehicle {
    private int speed;
    private String start;
    private String stop;
    private String accelerating;

    public Vehicle(){
        speed = 0;
        start = "";
        stop = "";
        accelerating = "";
    };

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getAccelerating() {
        return accelerating;
    }

    public void setAccelerating(String accelerating) {
        this.accelerating = accelerating;
    }


    public String toString() {
        return "the car is " + start + "\n" +
                "the car is  " + accelerating + "\n" +
                "the car is going " + speed + " mph " + "\n" +
                "the car  is " + stop;
    }

    public void displayVehicle() {
        System.out.println(this.toString() + start);
        System.out.println(this.toString() + accelerating);
        System.out.println(this.toString() + "going " + speed + " mph ");
        System.out.println(this.toString() + stop);
    }

}
