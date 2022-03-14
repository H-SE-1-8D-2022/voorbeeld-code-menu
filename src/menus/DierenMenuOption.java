package menus;

import menus.dieren.hondMenuOption;
import menus.dieren.paardMenuOption;

import java.util.ArrayList;

public class DierenMenuOption implements  iMenuOption{
    @Override
    public String getTitle() {
        return "Dieren";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new hondMenuOption());
        menuOptions.add(new paardMenuOption());
        return menuOptions;
    }

    @Override
    public void executeMenuOption() {

    }
}
