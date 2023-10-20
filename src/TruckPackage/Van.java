package TruckPackage;

public class Van extends Truck{

    TruckType type = TruckType.skåpbil;

    public Van(int weight) {
        super(weight);
    }

    @Override
    public String toString(){
        return "En " + this.type + " som väger " + this.weight + "kg";
    }
}

