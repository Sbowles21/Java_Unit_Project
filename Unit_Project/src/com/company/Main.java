package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        ArrayList<Minion1> Minion1 = new ArrayList<>();
        ArrayList<Minion2> Minion2 = new ArrayList<>();
        ArrayList<Boss> Boss = new ArrayList<>();
        Random r = new Random();
        int count = 0;

        System.out.print("~Hello to this fantasy world!~");
        System.out.print("\n~You are here to create your own adventure!~");
        System.out.print("\n");
        System.out.print("\n");
        while (true) {
            System.out.print("~Now create the first Minion~");
            System.out.print("\nWhat is the name of your minion? ");
            System.out.print("\n>");
            String Minion1_name = myscanner.nextLine();
            System.out.print("\nWhat is their health? 100-1000");
            System.out.print("\n>");
            int heath1 = myscanner.nextInt();
            if (heath1 < 100) {
                heath1 = 100;
            } else if (heath1 > 1000) {
                heath1 = 1000;
            }
            myscanner.nextLine();
            System.out.print("\nWhat weapon will they have?");
            System.out.print("""
                                    
                    1.Sword
                    2.Spear
                    3.Bow and Arrow
                    """);
            System.out.print("\n>");
            int weapon1 = myscanner.nextInt();
            myscanner.nextLine();
            if (weapon1 == 1) {
                int random_damage = r.nextInt(25 - 10) + 10;
                Minion1.add(new Minion1(Minion1_name, heath1, "Sword", random_damage));
            } else if (weapon1 == 2) {
                int random_damage = r.nextInt(30 - 15) + 15;
                Minion1.add(new Minion1(Minion1_name, heath1, "Spear", random_damage));
            } else if (weapon1 == 3) {
                int random_damage = r.nextInt(30 - 10) + 10;
                Minion1.add(new Minion1(Minion1_name, heath1, "Bow and Arrow", random_damage));
            }


            System.out.print("~Now create the second Minion ~");
            System.out.print("\nWhat is the name of your minion? ");
            System.out.print("\n>");
            String Minion2_name = myscanner.nextLine();
            System.out.print("\nWhat is their health? 100-1000");
            System.out.print("\n>");
            int heath2 = myscanner.nextInt();
            if (heath2 < 100) {
                heath2 = 100;
            } else if (heath2 > 1000) {
                heath2 = 1000;
            }
            myscanner.nextLine();
            System.out.print("\nWhat weapon will they have?");
            System.out.print("""
                                    
                    1.Sword
                    2.Spear
                    3.Bow and Arrow
                    """);
            System.out.print("\n>");
            int weapon2 = myscanner.nextInt();
            myscanner.nextLine();
            if (weapon2 == 1) {
                int random_damage = r.nextInt(25 - 10) + 10;
                Minion2.add(new Minion2(Minion2_name, heath2, "Sword", random_damage));
            } else if (weapon2 == 2) {
                int random_damage = r.nextInt(25 - 10) + 10;
                Minion2.add(new Minion2(Minion2_name, heath2, "Spear", random_damage));
            } else if (weapon2 == 3) {
                int random_damage = r.nextInt(25 - 10) + 10;
                Minion2.add(new Minion2(Minion2_name, heath2, "Bow and Arrow", random_damage));
            }

            System.out.print("~Now Create the boss ~");
            System.out.print("\nWhat is the name of your Boss? ");
            System.out.print("\n>");
            String Boss_name = myscanner.nextLine();
            System.out.print("\nWhat is their health? 10,000-100,000");
            System.out.print("\n>");
            int Bossheath = myscanner.nextInt();
            if (Bossheath < 10000) {
                Bossheath = 10000;
            } else if (Bossheath > 100000) {
                Bossheath = 100000;
            }
            myscanner.nextLine();
            System.out.print("\nWhat weapon will they have?");
            System.out.print("""
                                    
                    1.Vindicator's Cleaver
                    2.Hailstorm Harpoon
                    3.Mourning Flame
                    """);
            System.out.print("\n>");
            int Bossweapon = myscanner.nextInt();
            myscanner.nextLine();
            if (Bossweapon == 1) {
                int random_damage = r.nextInt(150 - 100) + 100;
                Boss.add(new Boss(Boss_name, Bossheath, "Sword", random_damage));
            } else if (Bossweapon == 2) {
                int random_damage = r.nextInt(175 - 125) + 100;
                Boss.add(new Boss(Boss_name, Bossheath, "Sword", random_damage));
            } else if (Bossweapon == 3) {
                int random_damage = r.nextInt(200 - 100) + 100;
                Boss.add(new Boss(Boss_name, Bossheath, "Sword", random_damage));
            }
            for (Minion1 m1 : Minion1) {
                System.out.print(m1.Name + " " + m1.Health + " " + m1.Weapon + " " + m1.Weapon_damage);
            }
            for (Minion2 m2 : Minion2) {
                System.out.print("\n" + m2.Name + " " + m2.Health + " " + m2.Weapon + " " + m2.Weapon_damage);
            }
            for (Boss b : Boss) {
                System.out.print("\n" + b.Name + " " + b.Health + " " + b.Weapon + " " + b.Weapon_damage);
            }

            System.out.print("~What would you like to do?~");
            System.out.print("""
                                            
                    1.Create
                    2.Edit
                    3.Delete
                    """);
            int input = myscanner.nextInt();
            myscanner.nextLine();
            if (input == 1) {
                System.out.print("""
                        ~What Town??~
                                            
                        1.Hollowfair
                        2.Rusthollow
                        3.Falsewallow
                        4.Oxhelm
                        5.Dravin
                        """);
                String town = "";
                int tinput = myscanner.nextInt();
                myscanner.nextLine();
                if (tinput == 1) {
                    town = "Hollowfair";
                }
                if (tinput == 2) {
                    town = "Rusthollow";
                }
                if (tinput == 3) {
                    town = "Falsewallow";
                }
                if (tinput == 4) {
                    town = "Oxhelm";
                }
                if (tinput == 5) {
                    town = "Dravin";
                }
            } else if (input == 2) {

            } else if (input == 3) {

            }
        }
    }
}
