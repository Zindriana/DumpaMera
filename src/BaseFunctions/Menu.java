package BaseFunctions;

import TruckPackage.TruckType;

public class Menu {
    Output out = new Output();
    Input inp = new Input();
    ChosenTruckType choose = new ChosenTruckType();

    public void mainMenu(Manager manager){
        out.mainMenuOption();
        int chosenOption = inp.chooseInt();
        TruckType chosenType;
        int chosenWeight;
        switch (chosenOption){
            case 1: manager.checkTerminals();
                    mainMenu(manager);
                    break;
            case 2: out.whichTypeOfTruck();
                    chosenType = choose.chooseTruckType(inp.chooseInt());
                    out.howMuchWeight();
                    chosenWeight = inp.chooseInt();
                    manager.addTruckToTerminal(chosenType, chosenWeight);
                    mainMenu(manager);
                    break;
            case 3 : out.goodBye(); break;
            default: out.illegalChoice();  mainMenu(manager);break;
            //default "loopar" metoden tills användaren ger ett korrekt värde
        }
    }
}
