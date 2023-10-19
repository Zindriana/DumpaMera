package TruckPackage;

public class HeavyTruck extends Truck {

    TruckType type = TruckType.heavyTruck;
    public HeavyTruck(int weight) {
        super(weight);

    }

    @Override
    public String toString(){
        return "En " + this.type + " som väger " + this.weight + "kg";
    }
}

