package menus.examen;

import menus.iMenuOption;

import java.util.ArrayList;

public class BiologieExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Biologie Examen";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
