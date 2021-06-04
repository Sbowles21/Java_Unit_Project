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
}
