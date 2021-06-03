package com.company;

public class Gamestate {
    String town;
    int amt;
    String what_kind;
    String how_many;
    int lives;
    double time_limit;

    public Gamestate(String town, int amt, String what_kind, String how_many, int lives, double time_limit) {
        this.town = town;
        this.amt = amt;
        this.what_kind = what_kind;
        this.how_many = how_many;
        this.lives = lives;
        this.time_limit = time_limit;
    }
}
