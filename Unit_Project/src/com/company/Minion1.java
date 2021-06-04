package com.company;
public class Minion1 {
    String Name;
    int Health;
    String Weapon;
    int Weapon_damage;

    public Minion1(String name, int health, String weapon, int weapon_damage) {
        Name = name;
        Health = health;
        Weapon = weapon;
        Weapon_damage = weapon_damage;
    }
    public void update(String name, int health, String weapon, int weapon_damage){
        this.Name = name;
        this.Health = health;
        this.Weapon = weapon;
        this.Weapon_damage = weapon_damage;
    }
}
