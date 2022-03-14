package menus.dieren.honden;

import menus.dieren.paardMenuOption;
import menus.iMenuOption;

import java.util.ArrayList;

public class labradorMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Labrador";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
