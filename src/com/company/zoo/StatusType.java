package com.company.zoo;

import static com.company.zoo.Texts.CLOSED_TXT;
import static com.company.zoo.Texts.OPEN_TXT;

public enum StatusType {
    OPEN(OPEN_TXT, 1),
    CLOSED(CLOSED_TXT, 0);

    public String status;
    public int statusVal;

    StatusType(String status, int statusVal) {
        this.status = status;
        this.statusVal = statusVal;
    }
}
