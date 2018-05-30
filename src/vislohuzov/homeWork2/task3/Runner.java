package vislohuzov.homeWork2.task3;

/**
 * Created by Ivan
 */
public class Runner {
    public static void main(String[] args) {
        Engine engine = new Engine(1200, 2.5);
        Car car1 = new Car("BMW", "725i", "2005", 30.2, 60, engine);
        car1.startCar(60);
        System.out.println(car1.getFuel());
        car1.go(100, 100);
        System.out.println(car1.getFuel());
        car1.go(40, 200);
        System.out.println(car1.getFuel());
        car1.go(40, 200);

    }
}
