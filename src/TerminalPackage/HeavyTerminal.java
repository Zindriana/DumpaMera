package TerminalPackage;

import BaseFunctions.Output;
import TruckPackage.HeavyTruck;
import TruckPackage.TruckType;

public class HeavyTerminal extends Terminal{
    Output out = new Output();
    public HeavyTerminal(String name, int weightCapacity, TruckType primary, TruckType secondary) {
        super(name, weightCapacity, TruckType.heavyTruck, secondary);
    }

    @Override
    public boolean addTruck(TruckType type, int weight, String name) {
        if (type.equals(this.primaryTruckType)){
            terminalSlot[0] = new HeavyTruck(weight);
            out.truckregistrated(type, weight, name);
            return true;
        } else {
            return false;
        }
    }
}
