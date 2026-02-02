package com.github.maxbrt;

public class ScoreScreen {
    public ScoreCounter scoreCounter = new ScoreCounter();

    public ScoreScreen() {
    }

    public void DisplayScoreScreen() {
        System.out.println(
                "Félécitation, vous avez complèter une partie de \"Le jeu\", une expérience interactive hors du commun.");
        System.out.println("Votre score est : " + scoreCounter.getScore());
        if (scoreCounter.getScore() >= 5) {
            System.out.println("Votre score est très impréssionant, vous avez gagné le jeu !");
        } else {
            System.out.println("Votre score est faible, vous n'etes pas très patient.");
        }
    }
}
