package menus;

public interface iMenuOption {

    String getTitle();

    default Submenu getNextSubMenu() {
        return null;
    }

    default void executeMenuOption() {

    }

}
