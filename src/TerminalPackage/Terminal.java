package TerminalPackage;

import TruckPackage.Truck;
import TruckPackage.TruckType;

public abstract class Terminal {

    protected String name;
    protected TruckType primaryTruckType; //Lastbilar av den här typen är alltid tillåtna i den här terminal.
    protected TruckType secondaryTruckType; //
    protected int weightCapacity; //The weight limit for trucks of the terminals secondary type

    protected Truck[] terminalSlot = new Truck[1]; //The truck object goes into this terminal slot

    public Terminal(String name, int weightCapacity, TruckType secondary){
        this.name = name;
        this.weightCapacity = weightCapacity;
        this.secondaryTruckType = secondary;

    }

    abstract public boolean addTruck(TruckType type, int weight, String name);

    public Truck[] getTerminalSlot() {
        return terminalSlot;
    }

    public String getName(){
        return name;
    }
}
