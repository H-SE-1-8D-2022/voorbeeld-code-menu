package menus.examen;

import menus.Submenu;
import menus.iMenuOption;

public class EngelsExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Engels Examen";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }

    @Override
    public void executeMenuOption() {

    }
}
