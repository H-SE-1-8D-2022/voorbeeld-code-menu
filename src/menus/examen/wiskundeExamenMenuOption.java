package menus.examen;

import menus.iMenuOption;

import java.util.ArrayList;

public class wiskundeExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Wiskunde Examen";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
