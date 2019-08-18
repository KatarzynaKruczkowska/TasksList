package com.company.zoo;

import java.util.Scanner;
import static com.company.zoo.Texts.*;
import static java.lang.String.format;

public class IOManagerConsole implements IOManager{
    private final Scanner INPUT = new Scanner(System.in);
    private static final String FORMATTED_MENU = "%d. %s";

    @Override
    public void showMessage(final String message) {
        System.out.println(message);
    }

    @Override
    public boolean getDecision(final String message) {
        showMessage(message);
        showMessage(TAKE_DECISION);
        showMessage("1 - " + DECISION_YES);
        showMessage("2 - " + DECISION_NO);
        int result = getNumber();
        return result == 1;
    }

    private int getNumber() {
        int result = 0;
        try {
            result = Integer.parseInt(INPUT.nextLine());
        } catch (NumberFormatException error) {
            showMessage(WRONG_FORMAT);
        } catch (Exception error) {
            error.printStackTrace();
        }
        return result;
    }

    public MenuType chooseFromMenu() {
        showMessage(MENU);
        for (MenuType menuType : MenuType.values()) {
            showMessage(format(FORMATTED_MENU, menuType.ordinal() + 1, menuType.menuDescription));
        }
        int result = 0;
        do {
            result = getNumber();
        } while (result < 1 || result > MenuType.values().length);
        return MenuType.values()[result - 1];
    }
}
