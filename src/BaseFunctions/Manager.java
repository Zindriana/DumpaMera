package BaseFunctions;

import TerminalPackage.HeavyTerminal;
import TerminalPackage.LightTerminal;
import TerminalPackage.MediumTerminal;
import TerminalPackage.Terminal;
import TruckPackage.TruckType;

public class Manager {

    Output out = new Output();

    Terminal[] terminals = //De fem kajerna, när sista argumentet "secondary" är null så spelar weightcapacity
                           // ingen roll och kan därför vara 0 i de fallen.
            {new LightTerminal("Kaj A",5000, /*TruckType.skåpbil,*/ TruckType.lättLastbil),
             new LightTerminal("Kaj B",0, /*TruckType.skåpbil,*/ null),
             new MediumTerminal("Kaj C",0, /*TruckType.lättLastbil,*/ null),
             new MediumTerminal("Kaj D",9000, /*TruckType.lättLastbil,*/TruckType.tungLastbil),
             new HeavyTerminal("Kaj E",0, /*TruckType.tungLastbil,*/ null)
            };

        //metod för att kolla igenom alla terminaler och skriva ut info om de parkerade lastbilarna
        public void checkTerminals(){
            out.terminalInformation();
            for (int i = 0; i < terminals.length; i++){
                if(!(terminals[i].getTerminalSlot()[0] == null)) {
                    out.confirmTruck(terminals, i);
                    }
            }out.newLine(); //den här raden kanske är överflödig
        }

        //Metod för att lägga till en lastbil i första bästa terminal som tillåter den typen av lastbil och vikt
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
