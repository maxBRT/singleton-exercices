package com.github.maxbrt;

public class Main {
    static void main() {

        // Création des écrans du jeu
        GameScreen gameScreen = new GameScreen();
        ScoreScreen scoreScreen = new ScoreScreen();

        // La boucle du jeu continue jusqu'à ce que l'utilisateur s'arrête
        gameScreen.GameLoop();

        // Affichage de la page de score
        scoreScreen.DisplayScoreScreen();
    }
}
