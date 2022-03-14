package menus.dieren;

import menus.dieren.honden.labradorMenuOption;
import menus.iMenuOption;

import java.util.ArrayList;

public class hondMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Hond";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new labradorMenuOption());
        return menuOptions;
    }

    @Override
    public void executeMenuOption() {

    }
}
