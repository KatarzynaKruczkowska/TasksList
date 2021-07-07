package com.company.zoo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;

import static com.company.zoo.Texts.*;

public class AppManager {

    private final IOManager ioManager;
    private List<Task> tasks = new LinkedList<>();

    public AppManager(final IOManager ioManager) {
        this.ioManager = ioManager;
    }

    public boolean play() throws IOException {

        switch (ioManager.chooseFromMenu()) {
            case TASKS_LIST:
                ioManager.showMessage("Lista zadań w przygotowaniu");
                ioManager.showMessage("wylistowanie zadań z numerami");
                ioManager.showMessage("wybierz zadanie do edycji lub 0 => nowe zadanie");
                //odczyt listy z pliku
                //BufferedReader fileR = new BufferedReader(new FileReader("plikZzadaniami.txt"));
                //tasks =
                //       fileR.read(tasks.add());


                if (tasks.isEmpty()) {
                    ioManager.showMessage(LACK_OF_TASKS);
                    ioManager.showMessage(ADD_NEW_TASK);
                    tasks = addNewTask();
                }

                // zapis do pliku
                FileWriter fileW = new FileWriter("plikZzadaniami.txt"); //303
                fileW.write(String.valueOf(tasks));
                break;
            case SETTINGS:
                ioManager.showMessage("Edycja ustawień w przygotowaniu");
                break;
            case CLOSED_TASKS_REVIEW:
                ioManager.showMessage("Przegląd zamkniętych zadań w przygotowaniu");
                break;
            case EXIT:
                return (true);
        }
        return (false);
    }

    public void addNewTask() {
        final ZonedDateTime createdDateTime = ZonedDateTime.now();
        TaskType taskType = ioManager.chooseTaskType();
        boolean isCyclic = ioManager.getDecision(IS_CYCLIC);
        CyclicType cyclicType = CyclicType.EMPTY;
        ZonedDateTime nextPeriod = createdDateTime;
        if (isCyclic){
            switch (cyclicType = ioManager.chooseCyclicType()){
                case ONCE_A_YEAR:
                    nextPeriod = nextPeriod.plusYears(1);
                case ONCE_A_MONTH:
                    nextPeriod = nextPeriod.plusMonths(1);
                case ONCE_A_WEEK:
                    nextPeriod = nextPeriod.plusWeeks(1);
                case EVERYDAY:
                    nextPeriod = nextPeriod.plusDays(1);
                case EVERYMONDAY:
                    DayOfWeek today = nextPeriod.getDayOfWeek();
                    nextPeriod = nextPeriod.plusDays(DayOfWeek.MONDAY.getValue() + 7 - today.getValue());
//jeżeli dzień oczekiwany > bieżący to tylko różnica oczek - bież
                    //jeżeli oczek < bież to oczekiw - bież + 7



            }

        }


        String typicalDescription;
        String additionalDescription;
        int status;
        ZonedDateTime lastEditDate;

    }
}
