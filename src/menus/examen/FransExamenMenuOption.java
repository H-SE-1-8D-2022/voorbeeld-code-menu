package menus.examen;

import menus.iMenuOption;

import java.util.ArrayList;

public class FransExamenMenuOption implements iMenuOption {
    @Override
    public String getTitle() {
        return "Frans Examen";
    }

    @Override
    public ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }


}
