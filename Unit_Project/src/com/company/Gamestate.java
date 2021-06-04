package com.company;

public class Gamestate {
    String title;
    String town;
    String what_kind;
    int lives;
    double time_limit;

    public Gamestate(String title, String town, String what_kind, int lives, double time_limit) {
        this.title = title;
        this.town = town;
        this.what_kind = what_kind;
        this.lives = lives;
        this.time_limit = time_limit;
    }
    public void all(){
        System.out.print("\nTitle: " + this.title + "\nTown: " + this.town + "\nKind of enemies: " + this.what_kind + "\nLives: " + this.lives + "\nTime Limit: " + this.time_limit + "\n\n");
    }
    public void update(String title, String town, String what_kind, int lives, double time_limit){
        this.title = title;
        this.town = town;
        this.what_kind = what_kind;
        this.lives = lives;
        this.time_limit = time_limit;
    }
}
