package com.in28minutes.learningspringframework;


public class AppGamingBasicJava {

    public static void main(String[] args) {
        
        var marioGame= new MarioGame();
        var runningGame=new RunningGame(marioGame);
        runningGame.run();

    }

}
