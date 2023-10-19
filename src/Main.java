//Snygga till inne på manager med printline, se om det går att flytta till output på ett smidigt sätt
//Ändra så att när konsolen printar ut trucktypen att det står på svenska för att vara mer enhetligt
//Snygga till genom att ta bort primary parametern i terminalerna
//Se om det går att återanvända samma lösning i Menu-switchen som används i ChosenTruckType-switchen
import BaseFunctions.Manager;
import BaseFunctions.Menu;

public class Main {

    public static void main(String[] args){
        Manager terminalManager = new Manager();
        Menu menu = new Menu();
        menu.mainMenu(terminalManager);
    }
}