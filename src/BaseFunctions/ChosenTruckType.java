package BaseFunctions;

import TruckPackage.TruckType;

public class ChosenTruckType {

    Input inp = new Input();
    Output out = new Output();
    public TruckType chooseTruckType(int choice){
        TruckType truck = null;
        switch(choice){
            case 1 : truck = TruckType.skåpbil; break;
            case 2 : truck = TruckType.lättLastbil; break;
            case 3 : truck = TruckType.tungLastbil; break;
            default: out.illegalChoice(); truck = chooseTruckType(inp.chooseInt());break;
            //default "loopar" metoden tills användaren ger ett korrekt värde
        } return truck;
    }
}
