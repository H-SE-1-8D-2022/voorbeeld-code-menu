package menus;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentenMenuOption implements iMenuOption {


    @Override
    public String getTitle() {
        return "Studenten";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {
        System.out.println("er zijn 10545u3w8752198374 studenten");




        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextLine());

    }
}
