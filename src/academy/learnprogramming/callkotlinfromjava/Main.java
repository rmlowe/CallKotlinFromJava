package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Car;
import academy.learnprogramming.kotlincode.SingletonObj;
import academy.learnprogramming.kotlincode.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("print this Java string");

        Car car = new Car("blue", "BMW", 2011);
        System.out.println(car.model);
        System.out.println(car.getColor());

        Car.carComp();
        System.out.println("isAuto = " + Car.constant);

        SingletonObj.doSomething();

        //car.printMe(null);

        try {
            StaticCar.doIO();
        }
        catch (IOException e) {
            System.out.println("IOException!");
        }

        StaticCar.defaultArgs("The Number is: ");


    }
}
