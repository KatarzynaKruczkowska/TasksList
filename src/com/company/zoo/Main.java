package com.company.zoo;

import static com.company.zoo.Texts.WELCOME;

public class Main {

    public static void main(String[] args) {
	    
        final IOManager ioManager = new IOManagerConsole();
        final AppManager appManager = new AppManager(ioManager);
        ioManager.showMessage(WELCOME);
        boolean End;
        do {
            End = appManager.play();
        } while (!End);
    }
}
