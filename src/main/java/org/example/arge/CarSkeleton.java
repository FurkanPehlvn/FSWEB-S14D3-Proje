package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {

        return  getName()+" :Starting engine.";
    }

    public String drive() {

        runEngine(this);
        return getName()+ " : Driving the car.";

    }

    protected void runEngine(CarSkeleton carSkeleton) {

        if(carSkeleton instanceof  ElectricCar){
           double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();

        } else if (carSkeleton instanceof HybridCar){
            int batterySize =  ((HybridCar) carSkeleton).getBatterySize();
            double avgKmPerCharge =  ((HybridCar) carSkeleton).getAvgKmPerLiter();
        } else if (carSkeleton instanceof GasPoweredCar){

        }else {
            System.out.println("invalid car type");
        }
    }
}
