package TerminalPackage;

import TruckPackage.LightTruck;
import TruckPackage.TruckType;
import TruckPackage.Van;
import BaseFunctions.Output;

public class LightTerminal extends Terminal{
    Output out = new Output();
    public LightTerminal(String name, int weightCapacity, TruckType primary, TruckType secondary) {
        super(name, weightCapacity, TruckType.van, secondary);
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

