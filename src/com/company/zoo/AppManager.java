package com.company.zoo;

import java.awt.*;

import static com.company.zoo.Texts.*;

public class AppManager {

    private final IOManager ioManager;

    public AppManager(final IOManager ioManager) {
        this.ioManager = ioManager;
    }

    public void play() {

        switch (ioManager.chooseFromMenu()) {
            case TASKS_LIST:
                ioManager.showMessage("Lista zadań w przygotowaniu");
                break;
            case SETTINGS:
                ioManager.showMessage("Edycja ustawień w przygotowaniu");
                break;
            case CLOSED_TASKS_REVIEW:
                ioManager.showMessage("Przegląd zamkniętych zadań w przygotowaniu");
                break;
            case EXIT:
                return;
        }
    }
}
