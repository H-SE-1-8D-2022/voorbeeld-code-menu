package menus.examen;

import menus.Submenu;
import menus.iMenuOption;

public class BiologieExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Biologie Examen";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
