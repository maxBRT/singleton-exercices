package com.github.maxbrt;

public class Main {
    static void main() {

        // Création des écrans du jeu
        GameScreen gameScreen = new GameScreen(new ScoreCounter());
        ScoreScreen scoreScreen = new ScoreScreen(new ScoreCounter());

        // La boucle du jeu continue jusqu'à ce que l'utilisateur s'arrête
        gameScreen.GameLoop();

        // Affichage de la page de score
        scoreScreen.DisplayScoreScreen();
    }
}
