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
        ArrayList<Gamestate> Game = new ArrayList<>();
        Random r = new Random();

        System.out.print("~Hello to this fantasy world!~");
        System.out.print("\n~You are here to create your own adventure!~");
        System.out.print("\n");
        int counter = 0;
        while (true) {
            System.out.print("~What would you like to do?~");
            System.out.print("""
                                            
                    1.Create
                    2.Edit
                    3.Delete
                    4.All
                    5.Quit
                    """);
            int input = myscanner.nextInt();
            myscanner.nextLine();
            if (input == 1) {
                System.out.print("What do you want to name your world? ");
                String title = myscanner.nextLine();
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
                    Boss.add(new Boss(Boss_name, Bossheath, "Vindicator's Cleaver", random_damage));
                } else if (Bossweapon == 2) {
                    int random_damage = r.nextInt(175 - 125) + 100;
                    Boss.add(new Boss(Boss_name, Bossheath, "Hailstorm Harpoon", random_damage));
                } else if (Bossweapon == 3) {
                    int random_damage = r.nextInt(200 - 100) + 100;
                    Boss.add(new Boss(Boss_name, Bossheath, "Mourning Flame", random_damage));
                }
                System.out.print("""
                        ~What Town??~
                                            
                        1.Hollowfair
                        2.Rusthollow
                        3.Falsewallow
                        4.Oxhelm
                        5.Dravin
                        """);
                System.out.print("\n>");
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
                System.out.print("\nWhat kind of enemies? (Write the names)");
                System.out.print("\n" + Minion1.get(counter).Name);
                System.out.print("\n" + Minion2.get(counter).Name);
                System.out.print("\n" + Boss.get(counter).Name);

                System.out.print("\n>");
                String kind = myscanner.nextLine();
                System.out.print("\nHow many lives do you want to have? ");
                int lives = myscanner.nextInt();
                myscanner.nextLine();
                System.out.print("\nHow long do you want the game to last?");
                double time = myscanner.nextDouble();
                Game.add(new Gamestate(title, town, kind, lives, time));
                for (Gamestate G : Game) {
                    if (title.equals(G.title)) {
                        System.out.print("~Minion 1~");
                        System.out.print("\nName: " + Minion1.get(counter).Name + "\nHealth: " + Minion1.get(counter).Health + "\nWeapon: " + Minion1.get(counter).Weapon + "\nWeapon Damage: " + Minion1.get(counter).Weapon_damage);
                        System.out.print("\n\n~Minion 2~");
                        System.out.print("\nName: " + Minion2.get(counter).Name + "\nHealth: " + Minion2.get(counter).Health + "\nWeapon: " + Minion2.get(counter).Weapon + "\nWeapon Damage: " + Minion2.get(counter).Weapon_damage);
                        System.out.print("\n\n~Boss~");
                        System.out.print("\nName: " + Boss.get(counter).Name + "\nHealth: " + Boss.get(counter).Health + "\nWeapon: " + Boss.get(counter).Weapon + "\nWeapon Damage: " + Boss.get(counter).Weapon_damage);
                        System.out.print("\n\n~Your created Game:~");
                        System.out.print("\nTitle: " + Game.get(counter).title + "\nTown: " + Game.get(counter).town + "\nKind of enemies: " + Game.get(counter).what_kind + "\nLives: " + Game.get(counter).lives + "\nTime Limit: " + Game.get(counter).time_limit + "\n\n");
                    }
                }
                counter += 1;
            }
            else if (input == 2) {
                int help = 0;
                while (help == 0) {
                    for (Gamestate G : Game) {
                        System.out.print("\n\n~Your created Game:~");
                        G.all();
                    }
                    System.out.print("What Game would you like to edit? (Q to quit)");
                    String G_input = myscanner.nextLine();
                    for (Gamestate Ga: Game){
                            if (G_input.equalsIgnoreCase("Q")) {
                                help +=1;
                                break;
                            } else if (Ga.title.equals(G_input)) {
                                int world_index = Game.indexOf(Ga);
                                System.out.print("What would you like to edit? ");
                                System.out.print("""
                                                                
                                        1.Title
                                        2.Town
                                        3.Enemy Type
                                        4.What kind of enemy?
                                        5.Lives
                                        6.Time Limit
                                        7.Quit
                                        """);
                                int change_input = myscanner.nextInt();
                                myscanner.nextLine();
                                if (change_input == 1) {
                                    System.out.print("What do you want to name your world?");
                                    Game.get(world_index).title = myscanner.nextLine();
                                }
                                else if (change_input == 2) {
                                    System.out.print("""
                                            ~What Town??~
                                                                
                                            1.Hollowfair
                                            2.Rusthollow
                                            3.Falsewallow
                                            4.Oxhelm
                                            5.Dravin
                                            """);
                                    System.out.print("\n>");
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
                                    Game.get(world_index).town = town;
                                }
                                else if (change_input == 3) {
                                    System.out.print("~Minion 1~");
                                    System.out.print("\nName: " + Minion1.get(world_index).Name);
                                    System.out.print("\n\n~Minion 2~");
                                    System.out.print("\nName: " + Minion2.get(world_index).Name);
                                    System.out.print("\n\n~Boss~");
                                    System.out.print("\nName: " + Boss.get(world_index).Name);
                                    System.out.print("\nChoose enemy by name! ");
                                    String enemy_input = myscanner.nextLine();
                                    String min1 = "";
                                    String min2 = "";
                                    String boss_name = "";
                                    for (Minion1 m1 : Minion1) {
                                        min1 = m1.Name;
                                    }
                                    for (Minion2 m2 : Minion2) {
                                        min2 = m2.Name;
                                    }
                                    for (Boss b : Boss) {
                                        boss_name = b.Name;
                                    }
                                    if (enemy_input.equals(min1)) {
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
                                            for (Minion1 m1 : Minion1) {
                                                m1.update(Minion1_name, heath1, "Sword", random_damage);
                                            }
                                        } else if (weapon1 == 2) {
                                            int random_damage = r.nextInt(30 - 15) + 15;
                                            for (Minion1 m1 : Minion1) {
                                                m1.update(Minion1_name, heath1, "Spear", random_damage);
                                            }
                                        } else if (weapon1 == 3) {
                                            int random_damage = r.nextInt(30 - 10) + 10;
                                            for (Minion1 m1 : Minion1) {
                                                m1.update(Minion1_name, heath1, "Bow and Arrow", random_damage);
                                            }
                                        }
                                    } else if (enemy_input.equals(min2)) {
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
                                            for (Minion2 m2 : Minion2) {
                                                m2.update(Minion2_name, heath2, "Sword", random_damage);
                                            }
                                        } else if (weapon2 == 2) {
                                            int random_damage = r.nextInt(25 - 10) + 10;
                                            for (Minion2 m2 : Minion2) {
                                                m2.update(Minion2_name, heath2, "Spear", random_damage);
                                            }
                                        } else if (weapon2 == 3) {
                                            int random_damage = r.nextInt(25 - 10) + 10;
                                            for (Minion2 m2 : Minion2) {
                                                m2.update(Minion2_name, heath2, "Bow and Arrow", random_damage);
                                            }
                                        }
                                    } else if (enemy_input.equals(boss_name)) {
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
                                            for (Boss B : Boss) {
                                                B.update(Boss_name, Bossheath, "Vindicator's Cleaver", random_damage);
                                            }
                                        } else if (Bossweapon == 2) {
                                            int random_damage = r.nextInt(175 - 125) + 100;
                                            for (Boss B : Boss) {
                                                B.update(Boss_name, Bossheath, "Hailstorm Harpoon", random_damage);
                                            }
                                        } else if (Bossweapon == 3) {
                                            int random_damage = r.nextInt(200 - 100) + 100;
                                            for (Boss B : Boss) {
                                                B.update(Boss_name, Bossheath, "Mourning Flame", random_damage);
                                            }
                                        }
                                    }
                                }
                                else if (change_input == 4) {
                                    System.out.print("\nWhat kind of enemies? (Write the names)\n ");
                                    System.out.print("~Minion 1~");
                                    System.out.print("\nName: " + Minion1.get(world_index).Name + "\nHealth: " + Minion1.get(world_index).Health + "\nWeapon: " + Minion1.get(world_index).Weapon + "\nWeapon Damage: " + Minion1.get(world_index).Weapon_damage);
                                    System.out.print("\n\n~Minion 2~");
                                    System.out.print("\nName: " + Minion2.get(world_index).Name + "\nHealth: " + Minion2.get(world_index).Health + "\nWeapon: " + Minion2.get(world_index).Weapon + "\nWeapon Damage: " + Minion2.get(world_index).Weapon_damage);
                                    System.out.print("\n\n~Boss~");
                                    System.out.print("\nName: " + Boss.get(world_index).Name + "\nHealth: " + Boss.get(world_index).Health + "\nWeapon: " + Boss.get(world_index).Weapon + "\nWeapon Damage: " + Boss.get(world_index).Weapon_damage);
                                    System.out.print("\n>");
                                    Game.get(world_index).what_kind = myscanner.nextLine();
                                }
                                else if (change_input == 5) {
                                    System.out.print("\nHow many lives do you want to have? ");
                                    int lives = myscanner.nextInt();
                                    myscanner.nextLine();
                                    Game.get(world_index).lives = lives;
                                }
                                else if (change_input == 6) {
                                    System.out.print("\n How long do you want te game to last?");
                                    Game.get(world_index).time_limit = myscanner.nextDouble();
                                }
                                else if (change_input == 7) {
                                    break;
                                }
                            }
                    }
                }
            }
            else if (input == 3) {
                if (Game.size() == 0) {
                    System.out.println("You have no Games!\n");
                } else if(Game.size() == 1){
                    System.out.print("You only have one world and cannot delete it!\n");
                }else {
                    System.out.print("What Game would you like to delete?");
                    System.out.print("\nName of world: ");
                    String deletedName = myscanner.nextLine();
                    Game.removeIf(game -> deletedName.equalsIgnoreCase(game.title));
                }
            }
            else if (input == 4) {
                for (Gamestate G : Game) {
                    System.out.print("\n\n~Your created Game:~");
                    G.all();
                }
            }
            else if (input == 5){
                break;
            }
        }
    }
}