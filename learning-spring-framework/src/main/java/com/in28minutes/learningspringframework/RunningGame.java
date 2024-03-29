package com.in28minutes.learningspringframework;

public class RunningGame {

    private GammingConsole gammingConsole;  // this makes running Game class tightly coupled as if new game is introduced I have to make alot of code changes in this class

    public RunningGame(GammingConsole gammingConsole) {
        this.gammingConsole=gammingConsole;
    }

    public void run() {
       System.out.println("Ya I am done"+ gammingConsole);
       gammingConsole.down();
       gammingConsole.left();
       gammingConsole.right();
       gammingConsole.up();
       
    }

}
