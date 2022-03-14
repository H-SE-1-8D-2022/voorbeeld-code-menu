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
    public Submenu getNextSubMenu() {
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new hondMenuOption());
        menuOptions.add(new paardMenuOption());

        Submenu submenu = new Submenu();
        submenu.setMenuOptions(menuOptions);
        return submenu;
    }

    @Override
    public void executeMenuOption() {

    }
}
