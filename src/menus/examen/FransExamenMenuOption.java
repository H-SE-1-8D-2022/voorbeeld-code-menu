package menus.examen;

import menus.Submenu;
import menus.iMenuOption;

public class FransExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Frans Examen";
    }

    @Override
    public Submenu getNextSubMenu() {
        return null;
    }


}
