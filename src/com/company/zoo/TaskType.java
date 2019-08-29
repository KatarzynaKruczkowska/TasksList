package com.company.zoo;

import static com.company.zoo.Texts.*;

public enum TaskType {
    TASK_TYPE0(TASK_TYPE0_TXT),
    TASK_TYPE1(TASK_TYPE1_TXT),
    TASK_TYPE2(TASK_TYPE2_TXT),
    TASK_TYPE3(TASK_TYPE3_TXT),
    TASK_TYPE4(TASK_TYPE4_TXT);

    public final String taskTypeDescription;

    TaskType(String taskTypeDescription){
        this.taskTypeDescription = taskTypeDescription;
    }
}
