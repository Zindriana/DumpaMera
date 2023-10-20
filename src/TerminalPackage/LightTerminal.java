package TerminalPackage;

import TruckPackage.LightTruck;
import TruckPackage.TruckType;
import TruckPackage.Van;
import BaseFunctions.Output;

public class LightTerminal extends Terminal{
    Output out = new Output();
    TruckType primaryTruckType = TruckType.skåpbil;

    //Konstruktor för terminal, primary kan tas bort
    public LightTerminal(String name, int weightCapacity, TruckType secondary) {
        super(name, weightCapacity, secondary);
    }

    @Override
    public boolean addTruck(TruckType type, int weight, String name) {
        if (type.equals(this.primaryTruckType)){
           terminalSlot[0] = new Van(weight);
           out.truckregistrated(type, weight, name);
           return true;
        } else if (type.equals(this.secondaryTruckType) && weight <= this.weightCapacity) {
            terminalSlot[0] = new LightTruck(weight);
            out.truckregistrated(type, weight, name);
            return true;
        } return false;
    }
}

