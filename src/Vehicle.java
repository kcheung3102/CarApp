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
                "the car is going " + speed + " mph ";

    }

    public void startVehicle() {
        System.out.println(this.toString() + " is " + getStart());
    }

    public void accelerateVehicle() {
        System.out.println(this.toString() + " is " + getAccelerating());
    }

    public void speedVehicle() {
        System.out.println(this.toString() + " is going " + getSpeed() + " mph ");
    }

    public void stopVehicle() {
        System.out.println(this.toString() + " is " + getStop());
    }

    public void emissionsCheck() {
        System.out.println(this.toString() + " has to get emissions checked");
    }

    public void emissionsPassed() {
        System.out.println(this.toString() + " passes emissions test");
    }

    public void passingVehicle() {
        System.out.println(this.toString() + "passes");
    }







}
