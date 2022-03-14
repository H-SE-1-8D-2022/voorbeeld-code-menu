package menus.dieren;

import menus.Submenu;
import menus.iMenuOption;

public class paardMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Paard";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
