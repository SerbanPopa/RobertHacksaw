package main;

import main.Game;

public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Robert Hacksaw", 1200, 600);
        game.start();
    }
}
