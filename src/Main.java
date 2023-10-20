import BaseFunctions.Manager;
import BaseFunctions.Menu;

public class Main {

    public static void main(String[] args){
        Manager terminalManager = new Manager();
        Menu menu = new Menu();
        menu.mainMenu(terminalManager);
    }
}