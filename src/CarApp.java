import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car();
        Car car2 = new Car();


        System.out.println("Enter Color: ");
        car.setColor(input.nextLine());

        System.out.println("Enter Model: ");
        car.setModel(input.nextLine());

        System.out.println("Enter Color: ");
        car2.setColor(input.nextLine());

        System.out.println("Enter Model: ");
        car2.setModel(input.nextLine());

        Collections.addAll(cars, car, car2);

       for(Car carr: cars) {
           System.out.println(carr.toString());
       }







    }



}
