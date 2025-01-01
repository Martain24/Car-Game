package com.mvilaboa;

public class Car {
    private boolean isStopped;
    private String carBrand;

    public Car(String carBrand) {
        setCarBrand(carBrand);
        this.isStopped = true;
    }

    public boolean isStopped() {
        return isStopped;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand.substring(0, 1).toUpperCase() + carBrand.substring(1).toLowerCase();
    }

    public void run() {
        if (!isStopped) {
            System.out.println("Sorry, the " + carBrand + " is already running.");
        } else {
            isStopped = false;
            System.out.println("You have started the " + carBrand + "!");
        }
    }

    public void stop() {
        if (isStopped) {
            System.out.println("Sorry, the " + carBrand + " is already stopped.");
        } else {
            isStopped = true;
            System.out.println("You have stopped the " + carBrand + "!");
        }
    }
}
