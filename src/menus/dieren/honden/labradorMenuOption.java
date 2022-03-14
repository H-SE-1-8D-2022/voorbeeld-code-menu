package menus.dieren.honden;

import menus.Submenu;
import menus.iMenuOption;

public class labradorMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Labrador";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
