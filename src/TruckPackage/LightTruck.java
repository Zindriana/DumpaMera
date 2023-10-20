package TruckPackage;

public class LightTruck extends Truck {

    TruckType type = TruckType.lättLastbil;
    public LightTruck(int weight) {
        super(weight);

    }

    @Override
    public String toString(){
        return "En " + this.type + " som väger " + this.weight + "kg";
    }
}

