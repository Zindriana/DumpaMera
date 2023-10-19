package BaseFunctions;

import TruckPackage.TruckType;

public class Output {

    public void truckregistrated(TruckType type, int weight, String name) {
        System.out.println(" - En " + type + " med vikten " + weight + "kg är registrerad vid " + name + "\n");
    }

    public void noTerminalAvailable(TruckType type, int weight){
           System.out.println("Det finns ingen tillgänglig plats för en " + type + " med vikten "
                   + weight + "kg just nu. Var vänlig och åk till stationen Dumpa Mest istället.\n");
    }

    public void mainMenuOption(){
        System.out.println(" - Avlastningsstationen Dumpa Mera - \n" +
                        "  1. Se parkerade lastbilar \n" +
                        "  2. Registrera ny avlastande lastbil \n" +
                        "  3. Avsluta \n"
                            );
    }

    public void whichTypeOfTruck(){
        System.out.println(" - Vilken typ av lastbil vill du registrera?\n" +
                            " 1. Van\n" +
                            " 2. Lätt lastbil\n" +
                            " 3. Tung lastbil\n"
        );
    }

    public void howMuchWeight(){
        System.out.println(" - Hur mycket vikt i kilogram väger lastbilen?");
    }

    public void illegalChoice(){
        System.out.println("Du måste välja en siffra mellan 1 och 3\n");
    }

    public void goodBye(){
        System.out.println("\n Hej då och välkommen åter!");
    }
}
