package com.company.zoo;

import static com.company.zoo.Texts.*;

public enum MenuType {
    TASKS_LIST(TASKS_LIST_TXT),
    SETTINGS(SETTINGS_TXT),
    CLOSED_TASKS_REVIEW(CLOSED_TASKS_REVIEW_TXT),
    EXIT(EXIT_TXT);

    public final String menuDescription;

    MenuType(final String menuDescription){
        this.menuDescription = menuDescription;
    }

}
