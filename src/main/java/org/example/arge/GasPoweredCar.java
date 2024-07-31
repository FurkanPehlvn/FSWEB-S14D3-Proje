package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }



    @Override
    public String startEngine() {
        runEngine(this);
        return getName()+" car starting";
    }

    @Override
    public String drive() {
        return "run from gas car";
    }


}
