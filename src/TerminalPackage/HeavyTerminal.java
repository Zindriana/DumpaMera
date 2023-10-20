package TerminalPackage;

import BaseFunctions.Output;
import TruckPackage.HeavyTruck;
import TruckPackage.TruckType;

public class HeavyTerminal extends Terminal{
    Output out = new Output();
    TruckType primaryTruckType = TruckType.tungLastbil;

    //Konstruktor för terminal, primary kan tas bort
    public HeavyTerminal(String name, int weightCapacity, TruckType secondary) {
        super(name, weightCapacity, secondary);
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
