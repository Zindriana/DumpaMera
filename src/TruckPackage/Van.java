package TruckPackage;

public class Van extends Truck{

    TruckType type = TruckType.van;

    public Van(int weight) {
        super(weight);
    }

    @Override
    public String toString(){
        return "En " + this.type + " som väger " + this.weight + "kg";
    }
}

