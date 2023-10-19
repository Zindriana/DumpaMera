package BaseFunctions;

import TruckPackage.TruckType;

public class ChosenTruckType {

    Input inp = new Input();
    Output out = new Output();
    public TruckType chooseTruckType(int choice){
        TruckType truck = null;
        switch(choice){
            case 1 : truck = TruckType.van; break;
            case 2 : truck = TruckType.lightTruck; break;
            case 3 : truck = TruckType.heavyTruck; break;
            default: out.illegalChoice(); truck = chooseTruckType(inp.chooseInt());break;
        } return truck;
    }
}
