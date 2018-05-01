package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Car;
import academy.learnprogramming.kotlincode.StaticCar;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("print this Java string");

        Car car = new Car("blue", "BMW", 2011);
        System.out.println(car.getModel());
        System.out.println(car.getColor());

    }
}
