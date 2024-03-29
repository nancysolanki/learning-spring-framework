package com.in28minutes.learningspringframework;


public class AppGamingBasicJava {

    public static void main(String[] args) {
        
        var game= new MarioGame();
        var runningGame=new RunningGame(game);
        runningGame.run();

    }

}
