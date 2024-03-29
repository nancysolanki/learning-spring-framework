package com.in28minutes.learningspringframework;

public class RunningGame {

    MarioGame marioGame;

    public RunningGame(MarioGame marioGame) {
        this.marioGame=marioGame;
    }

    public void run() {
       System.out.println("Ya I am done"+ marioGame);
       marioGame.down();
       marioGame.left();
       marioGame.right();
       marioGame.up();
    }

}
