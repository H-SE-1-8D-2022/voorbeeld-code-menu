package menus.examen;

import menus.Submenu;
import menus.iMenuOption;

public class wiskundeExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Wiskunde Examen";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
