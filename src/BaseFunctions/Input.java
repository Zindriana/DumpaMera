package BaseFunctions;
import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);

    public int chooseInt(){
        return Integer.parseInt(sc.nextLine());
    }
}
