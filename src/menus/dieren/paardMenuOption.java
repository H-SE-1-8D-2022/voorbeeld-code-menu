package menus.dieren;

import menus.iMenuOption;

import java.util.ArrayList;

public class paardMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Paard";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
