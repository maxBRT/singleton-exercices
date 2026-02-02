package com.github.maxbrt;

public class GameScreen {
    public ScoreCounter scoreCounter;

    public GameScreen(ScoreCounter scoreCounter) {
        this.scoreCounter = scoreCounter;
    }

    public void GameLoop() {
        System.out.println("Bienvenue dans \"Le jeu\", une expérience interactive hors du commun.");
        while (true) {
            // Le score est affiché et modifié ici
            System.out.println("Votre score est : " + scoreCounter.getScore());
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Jouer");
            System.out.println("2. Quitter");

            String choix = System.console().readLine();
            if (choix.equals("1")) {
                System.out.println("Vous avez choisi de jouer");
                scoreCounter.incrementScore();

            } else if (choix.equals("2")) {
                System.out.println("Vous avez choisi de quitter");
                break;

            } else {
                System.out.println("Vous avez choisi une option invalide");
            }
        }
    }

}
