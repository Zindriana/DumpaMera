package TerminalPackage;

import BaseFunctions.Output;
import TruckPackage.HeavyTruck;
import TruckPackage.LightTruck;
import TruckPackage.TruckType;

public class MediumTerminal extends Terminal{
    Output out = new Output();
    public MediumTerminal(String name, int weightCapacity, TruckType primary, TruckType secondary) {
        super(name, weightCapacity, TruckType.lightTruck, secondary);
    }

    @Override
    public boolean addTruck(TruckType type, int weight, String name) {
        if (type.equals(this.primaryTruckType)){
            terminalSlot[0] = new LightTruck(weight);
            out.truckregistrated(type, weight, name);
            return true;
        } else if (type.equals(this.secondaryTruckType) && weight <= this.weightCapacity) {
            terminalSlot[0] = new HeavyTruck(weight);
            out.truckregistrated(type, weight, name);
            return true;
        } return false;
    }
}

