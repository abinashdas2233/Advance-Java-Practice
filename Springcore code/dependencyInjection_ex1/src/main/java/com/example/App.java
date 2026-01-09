package com.example;


public class App {
    public static void main(String[] args) {
        Car car=new Car();
        IEngine engine=new DiselEngine();
        //Through setter method mannually inject dependency by programmer
        car.setEngine(engine);
        car.displayVehicle();
    }
}
