package menus;

import menus.examen.BiologieExamenMenuOption;
import menus.examen.EngelsExamenMenuOption;
import menus.examen.FransExamenMenuOption;
import menus.examen.wiskundeExamenMenuOption;

import java.util.ArrayList;

public class ExamenMenuOption implements iMenuOption{
    @Override
    public String getTitle() {
        return "Examen";
    }

    @Override
    public Submenu getNextSubMenu() {
        ArrayList<iMenuOption> menuOptions = new ArrayList<>();
        menuOptions.add(new BiologieExamenMenuOption());
        menuOptions.add(new EngelsExamenMenuOption());
        menuOptions.add(new FransExamenMenuOption());
        menuOptions.add(new wiskundeExamenMenuOption());

        Submenu submenu = new Submenu();
        submenu.setMenuOptions(menuOptions);
        return submenu;
    }

    @Override
    public void executeMenuOption() {

    }
}
