package vislohuzov.homeWork2.task3;

/**
 * Created by Ivan
 */
public class Car {
    /**
     * car's brand
     */
    private String brand;
    /**
     * car's model
     */
    private String model;
    /**
     * car's yearOfManufacture
     */
    private String yearOfManufacture;
    /**
     * car's fuel
     */
    private Double fuel;
    /**
     * car's capacityOfTank
     */
    private Integer capacityOfTank;


    private Conditioner conditioner = new Conditioner();
    private Engine engine;

    public Car(String brand, String model, String yearOfManufacture, Double fuel, Integer capacityOfTank, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.fuel = fuel;
        this.capacityOfTank = capacityOfTank;
        this.engine = engine;
    }
    /**
     * start car
     */
    public void startCar(Integer minute) {
        fuel = fuel - minute * 0.01;

    }

    /**
     * go car
     */
    public void go(Integer speed, Integer minute) {
        if(fuel<0){
            System.out.println("no fuel");
        }
        if (speed < 50) {
            fuel = fuel - minute * 0.1;
        }
        if (speed >= 50) {
            fuel = fuel - minute * 0.13;
        }
    }
    /**
     * maybe if I use real time I use it
     */
    public void stop() {

    }
    /**
     * get fuel
     */
    public Double getFuel() {
        if (fuel < 0) {
            return 0.0;
        }
        return fuel;
    }

}
