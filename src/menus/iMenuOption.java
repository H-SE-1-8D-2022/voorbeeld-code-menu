package menus;

import java.util.ArrayList;

public interface iMenuOption {

    String getTitle();

    default ArrayList<iMenuOption> getNextSubMenu() {
        return null;
    }

    default void executeMenuOption() {

    }

}
