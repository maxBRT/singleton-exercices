package com.github.maxbrt;

// Cette classe à pour but de gérer le score du joueur
// Au travers de l'application, il est utilisé par plusieurs écrans
public class ScoreCounter {
    private int score;

    public ScoreCounter() {
        this.score = 0;
    };

    public void incrementScore() {
        this.score++;
    }

    public int getScore() {
        return score;
    }
}
