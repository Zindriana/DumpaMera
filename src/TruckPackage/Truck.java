package TruckPackage;

public abstract class Truck {

    protected int weight;
    protected TruckType type;
    public Truck(int weight){
        this.weight = weight;
    }


    public String toString(){
        return "En " + this.type + " som väger " + this.weight + "kg";
    }
}
