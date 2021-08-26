import java.io.IOException;
import java.util.*;


public class Card {

    int cardNumber;
    String name;
    int rating1;
    int rating2;
    int rating3;
    int rating4;
    int rating5;


    public Card(int cn, String nm, int rat1, int rat2, int rat3, int rat4, int rat5) {
        cardNumber = cn;
        name = nm;
        rating1 = rat1;
        rating2 = rat2;
        rating3 = rat3;
        rating4 = rat4;
        rating5 = rat5;

    }

    public void showCard(String c1, String c2, String c3, String c4, String c5) {

        System.out.println(name);
        System.out.println(c1 + ": " + rating1);
        System.out.println(c2 + ": " + rating2);
        System.out.println(c3 + ": " + rating3);
        System.out.println(c4 + ": " + rating4);
        System.out.println(c5 + ": " + rating5);
    }

    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Card[] creaturesDeck = new Card[60];
//cat1: lifespan, cat2: size, cat3: intelligence, cat4: attack, cat5: prominence
        creaturesDeck[0] = new Card(1, "VAMPIRE", 90, 67, 90, 78, 94);
        creaturesDeck[1] = new Card(2, "WEREWOLF", 80, 81, 71, 85, 87);
        creaturesDeck[2] = new Card(3, "YETI", 60, 83, 50, 74, 72);
        creaturesDeck[3] = new Card(4, "TROLL", 44, 88, 46, 86, 76);
        creaturesDeck[4] = new Card(5, "WIZARD", 84, 84, 94, 93, 97);
        creaturesDeck[5] = new Card(6, "WITCH", 81, 69, 88, 90, 97);
        creaturesDeck[6] = new Card(7, "ZOMBIE", 18, 60, 14, 51, 92);
        creaturesDeck[7] = new Card(8, "TERMINATOR", 59, 70, 89, 90, 87);
        creaturesDeck[8] = new Card(9, "ZEUS", 99, 81, 86, 98, 92);
        creaturesDeck[9] = new Card(10, "ODIN", 99, 75, 82, 94, 87);
        creaturesDeck[10] = new Card(11, "THOR", 98, 75, 82, 95, 87);
        creaturesDeck[11] = new Card(12, "HERCULES", 93, 74, 89, 88, 86);
        creaturesDeck[12] = new Card(13, "ANGEL", 97, 65, 85, 88, 98);
        creaturesDeck[13] = new Card(14, "DEMON", 95, 78, 87, 92, 89);
        creaturesDeck[14] = new Card(15, "GRIM REAPER", 95, 72, 93, 74, 87);
        creaturesDeck[15] = new Card(16, "THE SPHINX", 84, 74, 54, 81, 73);
        creaturesDeck[16] = new Card(17, "SATAN", 97, 82, 98, 97, 98);
        creaturesDeck[17] = new Card(18, "SANTA CLAUS", 70, 76, 85, 52, 97);
        creaturesDeck[18] = new Card(19, "HEIDRUN", 89, 49, 24, 28, 19);
        creaturesDeck[19] = new Card(20, "HARPY", 44, 76, 75, 73, 42);
        creaturesDeck[20] = new Card(21, "GODZILLA", 87, 96, 53, 80, 86);
        creaturesDeck[21] = new Card(22, "POSEIDON", 90, 89, 81, 89, 77);
        creaturesDeck[22] = new Card(23, "CERBERUS", 85, 76, 49, 80, 52);
        creaturesDeck[23] = new Card(24, "BASILISK", 85, 71, 47, 87, 59);
        creaturesDeck[24] = new Card(25, "MINOTAUR", 50, 74, 45, 79, 62);
        creaturesDeck[25] = new Card(26, "CENTAUR", 43, 67, 60, 68, 64);
        creaturesDeck[26] = new Card(27, "GENIE", 94, 57, 73, 11, 80);
        creaturesDeck[27] = new Card(28, "GHOUL", 81, 72, 68, 80, 87);
        creaturesDeck[28] = new Card(29, "KRAKEN", 79, 91, 62, 88, 79);
        creaturesDeck[29] = new Card(30, "FAIRY", 78, 23, 85, 88, 90);
        creaturesDeck[30] = new Card(31, "KING KONG", 77, 90, 55, 81, 80);
        creaturesDeck[31] = new Card(32, "DRAGON", 76, 84, 83, 83, 91);
        creaturesDeck[32] = new Card(33, "LOCH NESS MONSTER", 75, 84, 73, 24, 81);
        creaturesDeck[33] = new Card(34, "ELF", 75, 34, 88, 44, 87);
        creaturesDeck[34] = new Card(35, "THE BOOGEYMAN", 74, 68, 74, 80, 76);
        creaturesDeck[35] = new Card(36, "UNICORN", 73, 72, 69, 46, 89);
        creaturesDeck[36] = new Card(37, "PHOENIX", 73, 43, 69, 34, 62);
        creaturesDeck[37] = new Card(38, "GRIFFIN", 51, 70, 42, 38, 54);
        creaturesDeck[38] = new Card(39, "GIANT", 70, 87, 71, 83, 84);
        creaturesDeck[39] = new Card(40, "GARGOYLE", 69, 58, 56, 63, 60);
        creaturesDeck[40] = new Card(41, "ALIEN", 67, 62, 95, 89, 92);
        creaturesDeck[41] = new Card(42, "MEDUSA", 69, 64, 75, 86, 65);
        creaturesDeck[42] = new Card(43, "PEGASUS", 61, 78, 53, 40, 63);
        creaturesDeck[43] = new Card(44, "CYCLOPS", 61, 87, 70, 80, 70);
        creaturesDeck[44] = new Card(45, "HELL HOUND", 53, 77, 42, 82, 59);
        creaturesDeck[45] = new Card(46, "MERMAID", 21, 76, 85, 88, 88);
        creaturesDeck[46] = new Card(47, "OGRE", 39, 75, 20, 79, 73);
        creaturesDeck[47] = new Card(48, "KILLER CLOWN", 33, 76, 63, 68, 75);
        creaturesDeck[48] = new Card(49, "CAPTAIN BLACKBEARD", 30, 63, 76, 67, 79);
        creaturesDeck[49] = new Card(50, "GOBLIN", 33, 59, 82, 68, 70);
        creaturesDeck[50] = new Card(51, "HENRY VIII WITH 8 LEGS", 30, 70, 73, 82, 63);
        creaturesDeck[51] = new Card(52, "MEGALODON", 29, 91, 43, 89, 62);
        creaturesDeck[52] = new Card(53, "TYRANNOSAURUS REX", 25, 83, 85, 88, 87);
        creaturesDeck[53] = new Card(54, "LEPRECHAUN", 11, 42, 85, 54, 84);
        creaturesDeck[54] = new Card(55, "BANSHEE", 8, 71, 63, 72, 60);
        creaturesDeck[55] = new Card(56, "FRANKENSTEIN'S MONSTER", 2, 74, 80, 49, 86);
        creaturesDeck[56] = new Card(57, "IMP", 89, 50, 73, 56, 58);
        creaturesDeck[57] = new Card(58, "BIGFOOT", 59, 76, 71, 64, 87);
        creaturesDeck[58] = new Card(59, "GHOST", 70, 65, 73, 70, 95);
        creaturesDeck[59] = new Card(60, "MUMMY", 28, 64, 32, 49, 77);


        Card[] athletesDeck = new Card[30];
//cat1: career span, cat2: legacy, cat3: athleticism, cat4: success, cat5: likeability
        athletesDeck[0] = new Card(1, "LIONEL MESSI", 17, 95, 83, 90, 7);
        athletesDeck[1] = new Card(2, "CRISTIANO RONALDO", 25, 87, 91, 83, 6);
        athletesDeck[2] = new Card(3, "PELÉ", 20, 89, 72, 90, 6);
        athletesDeck[3] = new Card(4, "DIEGO MARADONA", 21, 91, 78, 91, 7);
        athletesDeck[4] = new Card(5, "DAVID BECKHAM", 20, 85, 70, 79, 6);
        athletesDeck[5] = new Card(6, "ROGER FEDERER", 23, 83, 61, 91, 9);
        athletesDeck[6] = new Card(7, "RAFA NADAL", 20, 74, 40, 91, 5);
        athletesDeck[7] = new Card(8, "SERENA WILLIAMS", 26, 79, 89, 93, 6);
        athletesDeck[8] = new Card(9, "TIGER WOODS", 25, 93, 63, 94, 8);
        athletesDeck[9] = new Card(10, "USAIN BOLT", 12, 86, 95, 86, 6);
        athletesDeck[10] = new Card(11, "MICHAEL PHELPS", 12, 85, 92, 97, 7);
        athletesDeck[11] = new Card(12, "MICHAEL JORDAN", 15, 95, 91, 90, 6);
        athletesDeck[12] = new Card(13, "LEBRON JAMES", 17, 74, 92, 79, 6);
        athletesDeck[13] = new Card(14, "KOBE BRYANT", 20, 79, 84, 76, 6);
        athletesDeck[14] = new Card(15, "JESSE OWENS", 8, 96, 89, 88, 7);
        athletesDeck[15] = new Card(16, "O.J. SIMPSON", 11, 74, 86, 89, 2);
        athletesDeck[16] = new Card(17, "TOM BRADY", 21, 79, 75, 95, 6);
        athletesDeck[17] = new Card(18, "WAYNE GRETSKY", 20, 83, 79, 93, 7);
        athletesDeck[18] = new Card(19, "BABE RUTH", 22, 79, 53, 91, 8);
        athletesDeck[19] = new Card(20, "CONOR MCGREGOR", 8, 75, 85, 79, 5);
        athletesDeck[20] = new Card(21, "MIKE TYSON", 20, 89, 90, 84, 7);
        athletesDeck[21] = new Card(22, "MUHAMMAD ALI", 21, 97, 92, 87, 8);
        athletesDeck[22] = new Card(23, "FLOYD MAYWEATHER", 19, 77, 89, 91, 4);
        athletesDeck[23] = new Card(24, "TYSON FURY", 13, 79, 76, 91, 9);
        athletesDeck[24] = new Card(25, "LEWIS HAMILTON", 15, 87, 70, 90, 5);
        athletesDeck[25] = new Card(26, "MICHAEL SCHUMACHER", 19, 87, 65, 89, 5);
        athletesDeck[26] = new Card(27, "TONY HAWK", 17, 84, 76, 93, 7);
        athletesDeck[27] = new Card(28, "RONNIE O'SULLIVAN", 27, 72, 17, 95, 9);
        athletesDeck[28] = new Card(29, "LANCE ARMSTRONG", 19, 79, 84, 87, 3);
        athletesDeck[29] = new Card(30, "JOHNNY WILKINSON", 13, 65, 74, 84, 7);


        Card[] marvelDeck = new Card[23];
//cat1: power rating, cat2: agility, cat3: strength, cat4: intelligence, cat5: combat skills
        marvelDeck[0] = new Card(1, "SPIDERMAN", 91, 99, 94, 92, 96);
        marvelDeck[1] = new Card(2, "IRON MAN", 87, 90, 88, 93, 95);
        marvelDeck[2] = new Card(3, "THANOS", 95, 83, 97, 96, 96);
        marvelDeck[3] = new Card(4, "HULK", 96, 65, 100, 25, 60);
        marvelDeck[4] = new Card(5, "NICK FURY", 38, 50, 45, 77, 58);
        marvelDeck[5] = new Card(6, "LOKI", 90, 65, 82, 96, 72);
        marvelDeck[6] = new Card(7, "ALGRIM", 95, 60, 99, 40, 76);
        marvelDeck[7] = new Card(8, "TREVOR SLATTERY", 1, 1, 5, 1, 1);
        marvelDeck[8] = new Card(9, "ARNIM ZOLA", 0, 0, 0, 91, 0);
        marvelDeck[9] = new Card(10, "YONDU", 87, 30, 35, 40, 35);
        marvelDeck[10] = new Card(11, "CAPTAIN FALCON", 79, 94, 78, 70, 84);
        marvelDeck[11] = new Card(12, "MYSTERIO", 35, 85, 26, 76, 15);
        marvelDeck[12] = new Card(13, "THE SCARLET WITCH", 98, 45, 20, 90, 25);
        marvelDeck[13] = new Card(14, "ANT-MAN", 83, 100, 82, 86, 68);
        marvelDeck[14] = new Card(15, "DOCTOR STRANGE", 95, 35, 30, 98, 60);
        marvelDeck[15] = new Card(16, "ULTRON", 91, 92, 93, 88, 83);
        marvelDeck[16] = new Card(17, "BLACK PANTHER", 88, 98, 87, 83, 96);
        marvelDeck[17] = new Card(18, "NEBULA", 85, 88, 84, 75, 89);
        marvelDeck[18] = new Card(19, "GAMORA", 92, 90, 87, 88, 95);
        marvelDeck[19] = new Card(20, "CAPTAIN AMERICA", 90, 87, 89, 60, 92);
        marvelDeck[20] = new Card(21, "EGO", 89, 15, 98, 90, 40);
        marvelDeck[21] = new Card(22, "THE WINTER SOLDIER", 89, 88, 86, 67, 90);
        marvelDeck[22] = new Card(23, "THOR", 99, 93, 98, 92, 97);


        char deckInd = 'D';
        int numCards = 0;


        String cat1 = "cat";
        String cat2 = "cat";
        String cat3 = "cat";
        String cat4 = "cat";
        String cat5 = "cat";


        //indicator and counter for which player's turn it is
        int playerInd = 1;
        int pIndPrv = 0;
        int l = 1;

        int numP = 0;

        //setting number of players indicator based on user input
        while (true) {
            Scanner scan = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("\nHow many players?- \n");
            String numPlayers = scan.next();

            if (numPlayers.equals("2")) {
                numP = 2;
                break;
            } else if (numPlayers.equals("3")) {
                numP = 3;
                break;
            } else if (numPlayers.equals("4")) {
                numP = 4;
                break;
            } else {
                System.out.println("Try again");
                continue;
            }
        }

        //determining deck to be played
        while (true) {
            Scanner scan = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("\nPick a deck, Athletes, Creatures or Marvel- \n");
            String chosenDeck = scan.next();

            if (chosenDeck.equals("athletes") || chosenDeck.equals("Athletes") || chosenDeck.equals("a") || chosenDeck.equals("A") || chosenDeck.equals("at")) {
                deckInd = 'A';
                numCards = athletesDeck.length;
                break;
            } else if (chosenDeck.equals("creatures") || chosenDeck.equals("cr") || chosenDeck.equals("Creatures") || chosenDeck.equals("c") || chosenDeck.equals("C")) {
                deckInd = 'C';
                numCards = creaturesDeck.length;
                break;
            } else if (chosenDeck.equals("Marvel") || chosenDeck.equals("marvel") || chosenDeck.equals("MCU") || chosenDeck.equals("mcu") || chosenDeck.equals("m") || chosenDeck.equals("M")) {
                deckInd = 'M';
                numCards = marvelDeck.length;
                break;
            } else {
                System.out.println("Try again");
                continue;
            }
        }

        Card[] theDeck = new Card[numCards];

        if (deckInd == 'C') {
            theDeck = creaturesDeck;
            cat1 = "Lifespan";
            cat2 = "Size";
            cat3 = "Intelligence";
            cat4 = "Attack";
            cat5 = "Prominence";
        } else if (deckInd == 'A') {
            theDeck = athletesDeck;
            cat1 = "Career Span";
            cat2 = "Legacy";
            cat3 = "Athleticism";
            cat4 = "Success";
            cat5 = "Likeability";
        } else if (deckInd == 'M') {
            theDeck = marvelDeck;
            cat1 = "Power Rating";
            cat2 = "Agility";
            cat3 = "Strength";
            cat4 = "Intelligence";
            cat5 = "Combat Skill";
        }

        ArrayList<Integer> deck1 = new ArrayList<>();
        ArrayList<Integer> deck2 = new ArrayList<>();
        ArrayList<Integer> deck3 = new ArrayList<>();
        ArrayList<Integer> deck4 = new ArrayList<>();

        ArrayList<Integer> drawDeck = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        //initialising index within decks of card number of card to be played and card to be challenged
        int cardPlayedIdx = 0;
        int cardChallengedIdxA = 0;
        int cardChallengedIdxB = 0;
        int cardChallengedIdxC = 0;

        //Category ratings for each round
        int ratingPld = 0;
        int ratingA = 0;
        int ratingB = 0;
        int ratingC = 0;

        int rp1 = 0;
        int rp2 = 0;
        int rp3 = 0;
        int rp4 = 0;

        //set indicator for which player/s is out
        int pOut = 0;
        int pOut2 = 0;
        int pO = 0;

        //adjusting deck size to be divisible by number of players
      /*  while (numCards % numP != 0) {
            numCards -= 1;
        } */

//randomly dealing cards into temporary deck then assigning into player decks
        for (int i = 1; i < numCards + 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int j = 0; j < numCards; j++) {

            if (numP == 2) {
                if (j < numCards/2) {
                    deck1.add(list.get(j));
                } else {
                    deck2.add(list.get(j));
                }
            }
            if (numP == 3) {
                if (j < numCards / 3) {
                    deck1.add(list.get(j));
                } else if (j >= numCards / 3 && j < 2 * numCards / 3) {
                    deck2.add(list.get(j));
                } else {
                    deck3.add(list.get(j));
                }
            }
            if (numP == 4) {
                if (j < numCards / 4) {
                    deck1.add(list.get(j));
                } else if (j >= numCards / 4 && j < numCards / 2) {
                    deck2.add(list.get(j));
                } else if (j >= numCards / 2 && j < 3 * numCards / 4) {
                    deck3.add(list.get(j));
                } else {
                    deck4.add(list.get(j));
                }
            }
        }



        //main section of the game
        while ((numP == 2 && deck1.size() != 0 && deck2.size() != 0) ||

                (numP == 3 && (deck1.size() != 0 && deck2.size() != 0 ||
                                deck1.size() != 0 && deck3.size() != 0 ||
                                    deck2.size() != 0 && deck3.size() != 0)) ||

                (numP == 4 && (deck1.size() != 0 && (deck2.size() != 0 || deck3.size() != 0 || deck4.size() != 0) ||
                                deck2.size() != 0 && (deck3.size() != 0 || deck4.size() != 0) ||
                        (deck4.size() != 0 && deck3.size() != 0)))) {

            //setting which card is played/challenged based on the playerInd
            if (numP == 2) {
                if (playerInd == 1) {
                    cardPlayedIdx = deck1.get(0);
                    cardChallengedIdxA = deck2.get(0);
                } else if (playerInd == 2) {
                    cardPlayedIdx = deck2.get(0);
                    cardChallengedIdxA = deck1.get(0);
                }
            }

            if (numP == 3) {
                if (playerInd == 1){
                if (pOut == 1) {
                    playerInd = 2;
                    cardPlayedIdx = deck2.get(0);
                    cardChallengedIdxA = deck3.get(0);
                }
                else if (pOut == 2) {
                    cardPlayedIdx = deck1.get(0);
                    cardChallengedIdxA = deck3.get(0);
                }
                else if (pOut == 3) {
                    cardPlayedIdx = deck1.get(0);
                    cardChallengedIdxA = deck2.get(0);
                }
                else if (pOut == 0) {
                    cardPlayedIdx = deck1.get(0);
                    cardChallengedIdxA = deck2.get(0);
                    cardChallengedIdxB = deck3.get(0);
                }
            }
                else if (playerInd == 2) {
                    if (pOut == 1) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck3.get(0);
                    } else if (pOut == 2) {
                        playerInd = 3;
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 3) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 0) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck1.get(0);
                        cardChallengedIdxB = deck3.get(0);
                    }
                }
                else {
                    if (pOut == 1) {
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck2.get(0);
                    } else if (pOut == 2) {
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 3) {
                        playerInd = 1;
                        cardPlayedIdx = deck1.get(0);
                        cardChallengedIdxA = deck2.get(0);
                    } else if (pOut == 0) {
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck1.get(0);
                        cardChallengedIdxB = deck2.get(0);
                    }
                }
            }

            if (numP == 4) {
                if (playerInd == 1) {
                    //if p1 still in the game then its their go to play
                    if (pOut != 1 && pOut2 != 1) {
                        cardPlayedIdx = deck1.get(0);
                    }
                    if (pO == 3 || pO == 4 || (pOut == 1 && pOut2 == 0)) {
                        cardPlayedIdx = deck2.get(0);
                    }
                    if (pO == 2) {
                        cardPlayedIdx = deck3.get(0);
                    }
                    if ((pO == 0 && (pOut == 0 || pOut > 2)) || pO == 12) {
                        cardChallengedIdxA = deck2.get(0);
                    }
                    if ((pO == 0 && (pOut == 1 || pOut == 2)) || pO == 4 || pO == 8) {
                        cardChallengedIdxA = deck3.get(0);
                    }
                    if (pO == 2 || pO == 3 || pO == 6) {
                        cardChallengedIdxA = deck4.get(0);
                    }
                    if (pO == 0) {
                        if (pOut == 1 || pOut == 2 || pOut == 3) {
                            cardChallengedIdxB = deck4.get(0);
                        }
                        if (pOut == 0 || pOut == 4) {
                            cardChallengedIdxB = deck3.get(0);
                        }
                        if (pOut == 0) {
                            cardChallengedIdxC = deck4.get(0);
                        }
                    }
                }
                if (playerInd == 2) {
                    //if p2 still in the game then its their go to play
                    if (pOut != 2 && pOut2 != 2) {
                        cardPlayedIdx = deck2.get(0);
                    }
                    if ((pO == 0 && pOut == 2) || pO == 2 || pO == 8) {
                        cardPlayedIdx = deck3.get(0);
                    }
                    if (pO == 6) {
                        cardPlayedIdx = deck4.get(0);
                    }
                    //if p1 still in then they will be first card challenged
                    if ((pO == 0 && pOut != 1) || pO > 4) {
                        cardChallengedIdxA = deck1.get(0);
                    }
                    if ((pO == 0 && pOut == 1) || pO == 4) {
                        cardChallengedIdxA = deck3.get(0);
                    }
                    if (pO == 2 || pO == 3) {
                        cardChallengedIdxA = deck4.get(0);
                    }
                    if (pO == 0) {
                        if (pOut == 0 || pOut == 4) {
                            cardChallengedIdxB = deck3.get(0);
                        }
                        if (pOut == 1 || pOut == 2 || pOut == 3) {
                            cardChallengedIdxB = deck4.get(0);
                        }
                        if (pOut == 0) {
                            cardChallengedIdxC = deck4.get(0);
                        }
                    }
                }
                if (playerInd == 3) {
                    //if p3 still in the game then its their go to play
                    if (pOut != 3 && pOut2 != 3) {
                        cardPlayedIdx = deck3.get(0);
                    }
                    if ((pO == 0 && pOut == 3) || pO == 3 || pO == 6) {
                        cardPlayedIdx = deck4.get(0);
                    }
                    if (pO == 12) {
                        cardPlayedIdx = deck1.get(0);
                    }
                    //if p1 first card challenged
                    if (pO == 6 || pO == 8 || (pO == 0 && pOut != 1)) {
                        cardChallengedIdxA = deck1.get(0);
                    }//if p2 first card challenged
                    if (pO == 6 || pO == 8 || (pO == 0 && pOut == 1)) {
                        cardChallengedIdxA = deck2.get(0);
                    }//if p4...
                    if (pO == 2) {
                        cardChallengedIdxA = deck4.get(0);
                    }
                    if (pO == 0) {
                        if (pOut == 0 || pOut == 3 || pOut == 4) {
                            cardChallengedIdxB = deck2.get(0);
                        }
                        if (pOut == 1 || pOut == 2) {
                            cardChallengedIdxB = deck4.get(0);
                        }
                        if (pOut == 0) {
                            cardChallengedIdxC = deck4.get(0);
                        }
                    }
                }
                if (playerInd == 4) {
                    //if player 4 is still in the game
                    if (pOut != 4 && pOut2 != 4) {
                        cardPlayedIdx = deck4.get(0);
                    }
                    if ((pO == 0 && pOut == 4) || pO == 8 || pO == 12) {
                        cardPlayedIdx = deck1.get(0);
                    }
                    if (pO == 4) {
                        cardPlayedIdx = deck2.get(0);
                    }
                    //if p1 first card challenged
                    if (pO == 6 || (pO == 0 && pOut != 1 && pOut != 4)) {
                        cardChallengedIdxA = deck1.get(0);
                    }//if p2 first card challenged
                    if (pO == 3 || pO == 12 || (pO == 0 && (pOut == 1 || pOut == 4))) {
                        cardChallengedIdxA = deck2.get(0);
                    }//if p3...
                    if (pO == 2 || pO == 4 || pO == 8) {
                        cardChallengedIdxA = deck3.get(0);
                    }
                    if (pO == 0) {
                        if (pOut == 0 || pOut == 3) {
                            cardChallengedIdxB = deck2.get(0);
                        }
                        if (pOut == 1 || pOut == 2 || pOut == 4) {
                            cardChallengedIdxB = deck3.get(0);
                        }
                        if (pOut == 0) {
                            cardChallengedIdxC = deck4.get(0);
                        }
                    }
                }
            }

            int pldDeckIdx = cardPlayedIdx - 1;
            int chlngDeckIdxA = cardChallengedIdxA - 1;
            int chlngDeckIdxB = cardChallengedIdxB - 1;
            int chlngDeckIdxC = cardChallengedIdxC - 1;

            if (playerInd == 1) {
                System.out.println("Player 1's turn");
            } else if (playerInd == 2) {
                System.out.println("Player 2's turn");
            } else if (playerInd == 3) {
                System.out.println("Player 3's turn");
            } else if (playerInd == 4) {
                System.out.println("Player 4's turn");
            }

            //request user (p1) to choose first category
            System.out.print("\nPick a category- \n\n");
            theDeck[pldDeckIdx].showCard(cat1, cat2, cat3, cat4, cat5);
            Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
            String chosenCat = sc.next();

            //Conditional for case when first category is selected...
            if (deckInd == 'C' && (chosenCat.equals("lifespan") || chosenCat.equals("ls") || chosenCat.equals("li") || chosenCat.equals("l") || chosenCat.equals("L")) ||
                    (deckInd == 'A' && (chosenCat.equals("career span") || chosenCat.equals("cs") || chosenCat.equals("ca") || chosenCat.equals("c") || chosenCat.equals("C"))) ||
                    (deckInd == 'M' && (chosenCat.equals("pr") || chosenCat.equals("p") || chosenCat.equals("power rating") || chosenCat.equals("P") || chosenCat.equals("PR")))) {
                System.out.println("        vs.");
                theDeck[chlngDeckIdxA].showCard(cat1, cat2, cat3, cat4, cat5);
                ratingPld = theDeck[pldDeckIdx].rating1;
                ratingA = theDeck[chlngDeckIdxA].rating1;
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    ratingB = theDeck[chlngDeckIdxB].rating1;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxB].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                if (numP == 4 && pOut2 == 0) {
                    ratingC = theDeck[chlngDeckIdxC].rating1;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxC].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                System.out.println("\n" + cat1);
                System.out.println(theDeck[pldDeckIdx].name + ": " + theDeck[pldDeckIdx].rating1);
                System.out.println(theDeck[chlngDeckIdxA].name + ": " + theDeck[chlngDeckIdxA].rating1);
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    System.out.println(theDeck[chlngDeckIdxB].name + ": " + theDeck[chlngDeckIdxB].rating1);
                }
                if (numP == 4 && pOut2 == 0) {
                    System.out.println(theDeck[chlngDeckIdxC].name + ": " + theDeck[chlngDeckIdxC].rating1);
                }
            }
            else if ((deckInd == 'C' && (chosenCat.equals("size") || chosenCat.equals("si") || chosenCat.equals("sz") || chosenCat.equals("s") || chosenCat.equals("S"))) ||
                    (deckInd == 'A' && (chosenCat.equals("legacy") || chosenCat.equals("le") || chosenCat.equals("lg") || chosenCat.equals("Le"))) ||
                    (deckInd == 'M' && (chosenCat.equals("a") || chosenCat.equals("ag") || chosenCat.equals("agility") || chosenCat.equals("A")))) {
                System.out.println("        vs.");
                theDeck[chlngDeckIdxA].showCard(cat1, cat2, cat3, cat4, cat5);
                ratingPld = theDeck[pldDeckIdx].rating2;
                ratingA = theDeck[chlngDeckIdxA].rating2;
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    ratingB = theDeck[chlngDeckIdxB].rating2;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxB].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                if (numP == 4 && pOut2 == 0) {
                    ratingC = theDeck[chlngDeckIdxC].rating2;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxC].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                System.out.println("\n" + cat2);
                System.out.println(theDeck[pldDeckIdx].name + ": " + theDeck[pldDeckIdx].rating2);
                System.out.println(theDeck[chlngDeckIdxA].name + ": " + theDeck[chlngDeckIdxA].rating2);
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    System.out.println(theDeck[chlngDeckIdxB].name + ": " + theDeck[chlngDeckIdxB].rating2);
                }
                if (numP == 4 && pOut2 == 0) {
                    System.out.println(theDeck[chlngDeckIdxC].name + ": " + theDeck[chlngDeckIdxC].rating2);
                }
            } else if ((deckInd == 'C' && (chosenCat.equals("intelligence") || chosenCat.equals("in") || chosenCat.equals("i") || chosenCat.equals("I"))) ||
                    (deckInd == 'A' && (chosenCat.equals("athleticism") || chosenCat.equals("at") || chosenCat.equals("a") || chosenCat.equals("A"))) ||
                    (deckInd == 'M' && (chosenCat.equals("s") || chosenCat.equals("strength") || chosenCat.equals("st") || chosenCat.equals("S")))) {
                System.out.println("        vs.");
                theDeck[chlngDeckIdxA].showCard(cat1, cat2, cat3, cat4, cat5);
                ratingPld = theDeck[pldDeckIdx].rating3;
                ratingA = theDeck[chlngDeckIdxA].rating3;
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    ratingB = theDeck[chlngDeckIdxB].rating3;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxB].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                if (numP == 4 && pOut2 == 0) {
                    ratingC = theDeck[chlngDeckIdxC].rating3;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxC].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                System.out.println("\n" + cat3);
                System.out.println(theDeck[pldDeckIdx].name + ": " + theDeck[pldDeckIdx].rating3);
                System.out.println(theDeck[chlngDeckIdxA].name + ": " + theDeck[chlngDeckIdxA].rating3);
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    System.out.println(theDeck[chlngDeckIdxB].name + ": " + theDeck[chlngDeckIdxB].rating3);
                }
                if (numP == 4 && pOut2 == 0) {
                    System.out.println(theDeck[chlngDeckIdxC].name + ": " + theDeck[chlngDeckIdxC].rating3);
                }
            }
            else if ((deckInd == 'C' && (chosenCat.equals("attack") || chosenCat.equals("at") || chosenCat.equals("a") || chosenCat.equals("A"))) ||
                    (deckInd == 'A' && (chosenCat.equals("success") || chosenCat.equals("su") || chosenCat.equals("s") || chosenCat.equals("S"))) ||
                    (deckInd == 'M' && (chosenCat.equals("i") || chosenCat.equals("in") || chosenCat.equals("intelligence") || chosenCat.equals("I")))) {
                System.out.println("        vs.");
                theDeck[chlngDeckIdxA].showCard(cat1, cat2, cat3, cat4, cat5);
                ratingPld = theDeck[pldDeckIdx].rating4;
                ratingA = theDeck[chlngDeckIdxA].rating4;
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    ratingB = theDeck[chlngDeckIdxB].rating4;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxB].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                if (numP == 4 && pOut2 == 0) {
                    ratingC = theDeck[chlngDeckIdxC].rating4;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxC].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                System.out.println("\n" + cat4);
                System.out.println(theDeck[pldDeckIdx].name + ": " + theDeck[pldDeckIdx].rating4);
                System.out.println(theDeck[chlngDeckIdxA].name + ": " + theDeck[chlngDeckIdxA].rating4);
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    System.out.println(theDeck[chlngDeckIdxB].name + ": " + theDeck[chlngDeckIdxB].rating4);
                }
                if (numP == 4 && pOut2 == 0) {
                    System.out.println(theDeck[chlngDeckIdxC].name + ": " + theDeck[chlngDeckIdxC].rating4);
                }
            }
            else if ((deckInd == 'C' && (chosenCat.equals("prominence") || chosenCat.equals("pr") || chosenCat.equals("p") || chosenCat.equals("P"))) ||
                    (deckInd == 'A' && (chosenCat.equals("likeability") || chosenCat.equals("li") || chosenCat.equals("like") || chosenCat.equals("Li"))) ||
                    (deckInd == 'M' && (chosenCat.equals("c") || chosenCat.equals("cs") || chosenCat.equals("combat skills") || chosenCat.equals("C")))) {
                System.out.println("        vs.");
                theDeck[chlngDeckIdxA].showCard(cat1, cat2, cat3, cat4, cat5);
                ratingPld = theDeck[pldDeckIdx].rating5;
                ratingA = theDeck[chlngDeckIdxA].rating5;
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    ratingB = theDeck[chlngDeckIdxB].rating5;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxB].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                if (numP == 4 && pOut2 == 0) {
                    ratingC = theDeck[chlngDeckIdxC].rating5;
                    System.out.println("        vs.");
                    theDeck[chlngDeckIdxC].showCard(cat1, cat2, cat3, cat4, cat5);
                }
                System.out.println("\n" + cat5);
                System.out.println(theDeck[pldDeckIdx].name + ": " + theDeck[pldDeckIdx].rating5);
                System.out.println(theDeck[chlngDeckIdxA].name + ": " + theDeck[chlngDeckIdxA].rating5);
                if ((numP == 3 && pOut == 0) || (numP == 4 && pOut2 == 0)) {
                    System.out.println(theDeck[chlngDeckIdxB].name + ": " + theDeck[chlngDeckIdxB].rating5);
                }
                if (numP == 4 && pOut2 == 0) {
                    System.out.println(theDeck[chlngDeckIdxC].name + ": " + theDeck[chlngDeckIdxC].rating5);
                }
            } else {
                System.out.println("Not recognised try again");
                continue;
            }

            //assigning ratings to each player
            //player 1's turn
            if (playerInd == 1 ) {
                rp1 = ratingPld;
                rp2 = ratingA;
                rp3 = ratingB;
                rp4 = ratingC;
                if (pOut == 2 || pOut2 == 2) {
                    rp3 = rp2;
                    rp4 = rp3;
                    rp2 = 0;
                }
                if (pOut == 3 || pOut2 == 3) {
                    rp4 = rp3;
                    rp3 = 0;
                }
                if (pOut == 4 || pOut2 == 4) {
                    rp4 = 0;
                }
            }
            //Player 2's turn
            if (playerInd == 2) {
                rp2 = ratingPld;
                rp1 = ratingA;
                rp3 = ratingB;
                rp4 = ratingC;
                if (pOut == 1 || pOut2 == 1) {
                    rp4 = rp3;
                    rp3 = rp1;
                    rp1 = 0;
                }
                if (pOut == 3 || pOut2 == 3) {
                    rp4 = rp3;
                    rp3 = 0;
                }
                if (pOut == 4 || pOut2 == 4) {
                    rp4 = 0;
                }
            }
            //Player 3's turn
            if (playerInd == 3 ) {
                rp3 = ratingPld;
                rp1 = ratingA;
                rp2 = ratingB;
                rp4 = ratingC;
                if (pOut == 1 || pOut2 == 1) {
                    rp4 = rp2;
                    rp2 = rp1;
                    rp1 = 0;
                }
                if (pOut == 2 || pOut2 == 2) {
                    rp4 = rp2;
                    rp2 = 0;
                }
                if (pOut == 4 || pOut2 == 4) {
                    rp4 = 0;
                }
            }
            //Player 4's turn
            if (playerInd == 4) {
                rp4 = ratingPld;
                rp1 = ratingA;
                rp2 = ratingB;
                rp3 = ratingC;
                if (pOut == 1 || pOut2 == 1) {
                    rp3 = rp2;
                    rp2 = rp1;
                    rp1 = 0;
                }
                if (pOut == 2 || pOut2 == 2) {
                    rp3 = rp2;
                    rp2 = 0;
                }
                if (pOut == 3 || pOut2 == 3) {
                    rp3 = 0;
                }
            }

            //finding winner and assigning cards
            if (numP == 2) {
                //if player 1 wins
                if (rp1 > rp2) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck1.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck1.add(deck1.get(0));
                    deck1.add(deck2.get(0));
                    deck1.remove(0);
                    deck2.remove(0);

                    System.out.println("\nP1 wins the round");
                }
                //if player 2 wins
                else if (rp1 < rp2) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck2.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck2.add(deck1.get(0));
                    deck2.add(deck2.get(0));
                    deck1.remove(0);
                    deck2.remove(0);

                    System.out.println("\nP2 wins the round");
                } else {
                    //put cards into middle and go again
                    drawDeck.add(deck1.get(0));
                    drawDeck.add(deck2.get(0));
                    deck1.remove(0);
                    deck2.remove(0);

                    System.out.println("\nDraw");
                }
                System.out.println("Player 1 has " + deck1.size() + " cards, Player 2 has " + deck2.size() + " cards");
                if (drawDeck.isEmpty() == false) {
                    System.out.println("There are " + drawDeck.size() + " cards in the middle");
                }
                if (deck1.size() == 0) {
                    System.out.println("Player 2 wins it! A truly memorable performance.");
                }
                if (deck2.size() == 0) {
                    System.out.println("Player 1 wins the whole gosh darn game. What a performance.");
                }
            }

            if (numP == 3) {
                //if player 1 wins
                if (rp1 > rp2 && rp1 > rp3) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck1.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck1.add(deck1.get(0));
                    deck1.remove(0);
                    if (pOut != 2) {
                        deck1.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3) {
                        deck1.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.println("\nP1 wins the round");
                }
                //if player 2 wins
                else if (rp2 > rp1 && rp2 > rp3) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck2.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck2.add(deck2.get(0));
                    deck2.remove(0);
                    if (pOut != 1) {
                        deck2.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 3) {
                        deck2.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.println("\nP2 wins the round");
                }
                //if player 3 wins
                else if (rp3 > rp1 && rp3 > rp2) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck3.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck3.add(deck3.get(0));
                    deck3.remove(0);
                    if (pOut != 1) {
                        deck3.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2) {
                        deck1.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    System.out.println("\nP3 wins the round");
                }
                //draw only remaining possibility
                else {
                    //put cards into middle and go again
                    if (pOut != 1) {
                        drawDeck.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2) {
                        drawDeck.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.println("\nDraw");
                }
                if (pOut != 1) {
                    System.out.print("P1 has " + deck1.size() + " cards. ");
                }
                if (pOut != 2) {
                    System.out.print("P2 has " + deck2.size() + " cards. ");
                }
                if (pOut != 3) {
                    System.out.print("P3 has " + deck3.size() + " cards. ");
                }
                if (drawDeck.isEmpty() == false) {
                    System.out.println("There are " + drawDeck.size() + " cards in the middle");
                }
                if (deck1.size() == 0) {
                    if (deck2.size() > 0 && deck3.size() > 0) {
                        if (pOut == 0) {
                            System.out.println("\nPlayer 1 is out");
                            pOut = 1;
                        }
                    } else if (deck2.size() == 0) {
                        System.out.println("Player 3 wins!");
                        continue;
                    } else if (deck3.size() == 0) {
                        System.out.println("Player 2 wins!");
                        continue;
                    }
                }
                if (deck2.size() == 0) {
                    if (deck1.size() > 0 && deck3.size() > 0) {
                        if (pOut == 0) {
                            System.out.println("\nPlayer 2 is out");
                        }
                        pOut = 2;
                    }
                    else if (deck3.size() == 0) {
                        System.out.println("Player 1 wins!");
                        continue;
                    }
                }
                if (deck3.size() == 0) {
                    if (deck2.size() > 0 && deck1.size() > 0) {
                        if (pOut == 0) {
                            System.out.println("\nPlayer 3 is out");
                        }
                        pOut = 3;
                    }
                }
            }

            if (numP == 4) {
                //if player 1 wins
                if (rp1 > rp2 && rp1 > rp3 && rp1 > rp4) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck1.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck1.add(deck1.get(0));
                    deck1.remove(0);
                    if (pOut != 2 && pOut2 != 2) {
                        deck1.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3 && pOut2 != 3) {
                        deck1.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    if (pOut != 4 && pOut2 != 4) {
                        deck1.add(deck4.get(0));
                        deck4.remove(0);
                    }
                    System.out.println("\nP1 wins the round");
                }
                //if player 2 wins
                else if (rp2 > rp1 && rp2 > rp3 && rp2 > rp4) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck2.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck2.add(deck2.get(0));
                    deck2.remove(0);
                    if (pOut != 1 && pOut2 != 1) {
                        deck2.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 3 && pOut2 != 3) {
                        deck2.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    if (pOut != 4 && pOut2 != 4) {
                        deck2.add(deck4.get(0));
                        deck4.remove(0);
                    }
                    System.out.println("\nP2 wins the round");
                }
                //if player 3 wins
                else if (rp3 > rp1 && rp3 > rp2 && rp3 > rp4) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck3.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck3.add(deck3.get(0));
                    deck3.remove(0);
                    if (pOut != 1 && pOut2 != 1) {
                        deck3.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2 && pOut2 != 2) {
                        deck3.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 4 && pOut2 != 4) {
                        deck3.add(deck4.get(0));
                        deck4.remove(0);
                    }
                    System.out.println("\nP3 wins the round");
                }

                //if player 4 wins
                else if (rp4 > rp1 && rp4 > rp2 && rp4 > rp3) {
                    if (drawDeck.isEmpty() == false) {
                        for (int i = 0; i < drawDeck.size(); i++) {
                            deck4.add(drawDeck.get(i));
                        }
                        drawDeck.removeAll(drawDeck);
                    }
                    deck4.add(deck4.get(0));
                    deck4.remove(0);
                    if (pOut != 1 && pOut2 != 1) {
                        deck4.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2 && pOut2 != 2) {
                        deck4.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3 && pOut2 != 3) {
                        deck4.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.println("\nP4 wins the round");
                }
                //draw
                else {
                    //put cards into middle and go again
                    if (pOut != 1) {
                        drawDeck.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2) {
                        drawDeck.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    if (pOut != 4) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }

                    System.out.println("\nDraw");
                }
                if (pOut != 1 && pOut2 != 1) {
                    System.out.print("P1 has " + deck1.size() + " cards. ");
                }
                if (pOut != 2&& pOut2 != 2) {
                    System.out.print("P2 has " + deck2.size() + " cards. ");
                }
                if (pOut != 3 && pOut2 != 3) {
                    System.out.print("P3 has " + deck3.size() + " cards. ");
                }
                if (pOut != 4 && pOut2 != 4) {
                    System.out.print("P4 has " + deck4.size() + " cards. ");
                }
                if (drawDeck.isEmpty() == false) {
                    System.out.println("There are " + drawDeck.size() + " cards in the middle");
                }
                if (deck1.size() == 0) {
                    if (deck2.size() > 0 && deck3.size() > 0 || deck2.size() > 0 && deck4.size() > 0 ||
                    deck3.size() > 0 && deck4.size() > 0) {
                        if (pOut == 0 || pOut2 == 0) {
                            System.out.println("\nPlayer 1 is out");
                            if (pOut == 0) {
                                pOut = 1;
                            } else {
                                pOut2 = 1;
                            }
                        }
                    }
                    else if (deck2.size() == 0 && deck3.size() == 0 && deck4.size() > 0) {
                        System.out.println("Player 4 wins!");
                        continue;
                    }
                    else if (deck2.size() == 0 && deck4.size() == 0 && deck3.size() > 0) {
                        System.out.println("Player 3 wins!");
                        continue;
                    }
                    else if (deck3.size() == 0 && deck4.size() == 0 && deck2.size() > 0) {
                        System.out.println("Player 2 wins!");
                        continue;
                    }
                }
                if (deck2.size() == 0) {
                    if (deck1.size() > 0 && deck3.size() > 0 || deck1.size() > 0 && deck4.size() > 0 ||
                            deck3.size() > 0 && deck4.size() > 0) {
                        if (pOut == 0 || pOut2 == 0) {
                            System.out.println("\nPlayer 2 is out");
                            if (pOut == 0) {
                                pOut = 2;
                            } else {
                                pOut2 = 2;
                            }
                        }
                    }else if (deck1.size() > 0 && deck3.size() == 0 && deck4.size() == 0) {
                        System.out.println("Player 1 wins!");
                        continue;
                    }
                }
                if (deck3.size() == 0) {
                    if (deck1.size() > 0 && deck2.size() > 0 || deck1.size() > 0 && deck4.size() > 0 ||
                            deck2.size() > 0 && deck4.size() > 0) {
                        if (pOut == 0 || pOut2 == 0) {
                            System.out.println("\nPlayer 3 is out");
                            if (pOut == 0) {
                                pOut = 3;
                            } else {
                                pOut2 = 3;
                            }
                        }
                    }
                }
                if (deck4.size() == 0) {
                    if (deck1.size() > 0 && deck2.size() > 0 || deck1.size() > 0 && deck3.size() > 0 ||
                            deck2.size() > 0 && deck3.size() > 0) {
                        if (pOut == 0 || pOut2 == 0) {
                            System.out.println("\nPlayer 4 is out");
                            if (pOut == 0) {
                                pOut = 4;
                            } else {
                                pOut2 = 4;
                            }
                        }
                    }
                }
            }

            pO = pOut * pOut2;

            pIndPrv = playerInd;
            playerInd++;

            //skip the turn of players who are out of the game
            while (playerInd == pOut || playerInd == pOut2 || playerInd > numP) {
                if (playerInd == pOut || playerInd == pOut2) {
                    playerInd += 1;
                }
                if (playerInd > numP) {
                    playerInd = 1;
                }
            }
            promptEnterKey();
            }
        }
    }
