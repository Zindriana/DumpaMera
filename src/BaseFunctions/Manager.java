package BaseFunctions;

import TerminalPackage.HeavyTerminal;
import TerminalPackage.LightTerminal;
import TerminalPackage.MediumTerminal;
import TerminalPackage.Terminal;
import TruckPackage.TruckType;

public class Manager {

    Output out = new Output();

    Terminal[] terminals =
            {new LightTerminal("Kaj A",5000, TruckType.van, TruckType.lightTruck),
             new LightTerminal("Kaj B",0, TruckType.van, null),
             new MediumTerminal("Kaj C",0, TruckType.lightTruck, null),
             new MediumTerminal("Kaj D",9000, TruckType.lightTruck,TruckType.heavyTruck),
             new HeavyTerminal("Kaj E",0, TruckType.heavyTruck, null)
            };

        public void checkTerminals(){
            System.out.println(" \n Följande lastbilar står just nu parkerade terminalerna: ");
            for (int i = 0; i < terminals.length; i++){
                if(!(terminals[i].getTerminalSlot()[0] == null)) {
                    System.out.println(" - " + terminals[i].getTerminalSlot()[0].toString() + " på " + terminals[i].getName());
                }
            }System.out.println("\n");
        }


        public void addTruckToTerminal(TruckType type, int weight){
            for (int i = 0; i < terminals.length; i++){
                if (terminals[i].getTerminalSlot()[0] == null){
                    if (terminals[i].addTruck(type, weight, terminals[i].getName()))
                    {return;}
                } if(i == 4) {
                    out.noTerminalAvailable(type, weight);
                  }
            }
        }
}
