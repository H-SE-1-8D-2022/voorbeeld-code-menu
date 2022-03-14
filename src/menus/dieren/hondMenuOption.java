package menus.dieren;

import menus.Submenu;
import menus.dieren.honden.labradorMenuOption;
import menus.iMenuOption;

import java.util.ArrayList;

public class hondMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Hond";
    }

    @Override
    public Submenu getNextSubMenu() {
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new labradorMenuOption());

        Submenu submenu = new Submenu();
        submenu.setMenuOptions(menuOptions);
        return submenu;
    }

    @Override
    public void executeMenuOption() {

    }
}
