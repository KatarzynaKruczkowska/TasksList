package com.company.zoo;

import java.time.ZonedDateTime;

public class Task {
    private final ZonedDateTime createdDateTime;
    private TaskType taskType;
    private final boolean isCyclic;
    private CyclicType cyclicType;
    private ZonedDateTime nextPeriod; //date
    private String description;
    private int status;
    private ZonedDateTime lastEditDate;


    public Task(TaskType taskType,
                final boolean isCyclic,
                CyclicType cyclicType,
                ZonedDateTime nextPeriod,
                String description,
                int status,
                ZonedDateTime lastEditDate) {
        this.createdDateTime = ZonedDateTime.now();
        this.taskType = taskType;
        this.isCyclic = isCyclic;
        this.cyclicType = cyclicType;
        this.nextPeriod = nextPeriod;
        this.description = description;
        this.status = status;
        this.lastEditDate = lastEditDate;


    }

}
