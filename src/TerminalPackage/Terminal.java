package TerminalPackage;

import TruckPackage.Truck;
import TruckPackage.TruckType;

public abstract class Terminal {

    protected String name;
    protected TruckType primaryTruckType; //Trucks of this type is always allowed in the terminal.
    protected TruckType secondaryTruckType; //Trucks of this type is allowed if they also weight less than weightCapacity
    protected int weightCapacity; //The weight limit for trucks of the terminals secondary type

    protected Truck[] terminalSlot = new Truck[1]; //The truck object goes into this terminal slot

    public Terminal(String name, int weightCapacity, TruckType primary, TruckType secondary){
        this.name = name;
        this.weightCapacity = weightCapacity;
        this.primaryTruckType = primary;
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
