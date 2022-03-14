import menus.DierenMenuOption;
import menus.ExamenMenuOption;
import menus.StudentenMenuOption;
import menus.iMenuOption;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuManager {

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<iMenuOption> menuOptions;
    private List<ArrayList<iMenuOption>> previousMenu = new ArrayList<ArrayList<iMenuOption>>();

    public void start(){

        this.menuOptions = getDefaultMenuOptions();
        print();

    }

    public void print(){
        printMenu();
        processUserInput(getUserInput());

    }

    public void reCheckUserInput(){
        processUserInput(getUserInput());
    }

    private void processUserInput(int index){


        if(index == 0){
            //We're in the main menu
            if(previousMenu.size() == 0){
                return;
            }

            menuOptions = previousMenu.get(previousMenu.size() -1);
            previousMenu.remove(previousMenu.size()-1);

            print();
            return;
        }

        index--;
        menuOptions.get(index).executeMenuOption();
        var newMenuOptions = menuOptions.get(index).getNextSubMenu();

        if(newMenuOptions == null){
            reCheckUserInput();
            return;
        }

        previousMenu.add(menuOptions);

        menuOptions = newMenuOptions;
        print();
    }

    private int getUserInput(){
        boolean noValidAnswer = true;
        while(noValidAnswer) {
            try {
                int answer = scanner.nextInt();

                //See if the answer is inbetween the actual posible answers.
                if (answer > menuOptions.size() || answer < 0) {
                    System.out.println("Please enter a valid number.");
                } else {
                    return answer;
                }
            } catch (InputMismatchException e) {
                //input mismatch exception means they put text in the input but we're looking for ints so the input mismatches the expected outcome.
                System.out.println("Please enter a valid number.");
            }
        }
        return 0;
    }

    private void printMenu(){

        for(int i = 0; i < menuOptions.size(); i++){
            System.out.println(i+1 + ": "+menuOptions.get(i).getTitle());
        }
        System.out.println("0: Exit");
    }

    private ArrayList<iMenuOption> getDefaultMenuOptions(){
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new DierenMenuOption());
        menuOptions.add(new ExamenMenuOption());
        menuOptions.add(new StudentenMenuOption());

        return menuOptions;
    }
}
