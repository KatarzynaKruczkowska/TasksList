package com.company.zoo;

import static com.company.zoo.Texts.*;

public enum CyclicType {
    ONCE_A_YEAR(ONCE_A_TEAR_TXT),
    ONCE_A_MONTH(ONCE_A_MONTH_TXT),
    ONCE_A_WEEK(ONCE_A_WEEK_TXT),
    EVERYDAY(EVERYDAY_TXT),
    EVERYMONDAY(EVERY_MONDAY_TXT),
    EVERYTUESDAY(EVERY_TUESDAY_TXT),
    EVERYWEDNESDAY(EVERY_WEDNESDAY_TXT),
    EVERYTHURSDAY(EVERY_THURSDAY_TXT),
    EVERYFRIDAY(EVERY_FRIDAY_TXT),
    EVERYSATURDAY(EVERY_SATURDAY_TXT),
    EVERYSUNDAY(EVERY_SUNDAY_TXT),
    ON_THE_DAY(ON_THE_DAY_TXT),
    EMPTY(EMPTY_TXT);

    public final String cyclicTypeDescription;

    CyclicType(final String cyclicTypeDescription){
        this.cyclicTypeDescription = cyclicTypeDescription;
    }


}
