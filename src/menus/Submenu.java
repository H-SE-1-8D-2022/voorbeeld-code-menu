package menus;

import java.util.ArrayList;

public class Submenu {

    private ArrayList<iMenuOption> menuOptions = new ArrayList<>();

    public void setMenuOptions(ArrayList<iMenuOption> menuOptions) {
        this.menuOptions = menuOptions;
    }

    public ArrayList<iMenuOption> getMenuOptions() {
        return menuOptions;
    }

}
