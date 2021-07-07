package com.company.zoo;

import java.util.Scanner;

import static com.company.zoo.Texts.*;
import static java.lang.String.format;

public class IOManagerConsole implements IOManager {
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

    public TaskType chooseTaskType(){
        showMessage(CHOOSE_TASK_TYPE);
        for(TaskType taskType : TaskType.values()){
            showMessage(format(FORMATTED_MENU, taskType.ordinal() + 1, taskType.taskTypeDescription));
        }
        int result = 0;
        do {
            result = getNumber();
        } while (result < 1 || result > TaskType.values().length);
        return TaskType.values()[result - 1];
    }

    @Override
    public CyclicType chooseCyclicType() {
        showMessage(CHOOSE_CYCLIC_TYPE);
        for(CyclicType cyclicType : CyclicType.values()){
            showMessage(format(FORMATTED_MENU, cyclicType.ordinal() + 1, cyclicType.cyclicTypeDescription));
        }
        int result = 0;
        do {
            result = getNumber();
        } while (result < 1 || result > TaskType.values().length);
        return CyclicType.values()[result - 1];
    }
}
