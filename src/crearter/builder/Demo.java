package crearter.builder;

import crearter.builder.builders.CarBuilder;
import crearter.builder.builders.CarManualBuilder;
import crearter.builder.cars.Car;
import crearter.builder.cars.Manual;
import crearter.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built: \n" + car.getCarType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("Manual built: \n" + manual.print());

    }

}
