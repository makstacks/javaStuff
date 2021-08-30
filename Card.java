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

//method to find out who drew and who lost in the previous round so that the losers cant win current round and their
// card is excluded
    public static int[] findDrawers(int rp1p, int rp2p, int rp3p, int rp4p) {
//creating array to store the values of played ratings in prev round
        int[] rpPrv = {rp1p, rp2p, rp3p, rp4p};
        //start with first value of array to compare, and initialise values to store the lowest values
        int max1 = rpPrv[0];
        for (int i=1; i<rpPrv.length; i++) {
            if (rpPrv[i] > max1) {
                max1 = rpPrv[i];   // new maximum
            }
        }
        //create array to store indicators of which players won and which lost
        int[] drawIndArray = {0, 0, 0, 0};
        for (int i=0; i<rpPrv.length; i++) {
            if (rpPrv[i] == max1) {
                drawIndArray[i] = 1;   // set to a 1 if into next round
            }
        }
        return drawIndArray;
    }//end method draw lose stuff

    //method to show card during the game
    public void showCard(String c1, String c2, String c3, String c4, String c5) {
        //calculating how long each category string is so we can right justify the numbers
        int c1l = c1.length();
        int c2l = c2.length();
        int c3l = c3.length();
        int c4l = c4.length();
        int c5l = c5.length();

        System.out.println("________________________");
        System.out.println(name);
        System.out.printf("%-20s %d%n", c1 + ":", rating1);
        System.out.printf("%-20s %d%n", c2 + ":", rating2);
        System.out.printf("%-20s %d%n", c3 + ":", rating3);
        System.out.printf("%-20s %d%n", c4 + ":", rating4);
        System.out.printf("%-20s %d%n", c5 + ":", rating5);
        System.out.println("________________________");
    }

    //method to ask user to hit enter in between rounds
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
        athletesDeck[24] = new Card(25, "LEWIS HAMILTON", 15, 87, 73, 90, 5);
        athletesDeck[25] = new Card(26, "MICHAEL SCHUMACHER", 19, 87, 66, 89, 5);
        athletesDeck[26] = new Card(27, "TONY HAWK", 17, 84, 76, 93, 7);
        athletesDeck[27] = new Card(28, "RONNIE O'SULLIVAN", 27, 72, 17, 95, 9);
        athletesDeck[28] = new Card(29, "LANCE ARMSTRONG", 19, 79, 84, 87, 3);
        athletesDeck[29] = new Card(30, "JOHNNY WILKINSON", 13, 65, 74, 84, 7);


        Card[] marvelDeck = new Card[60];
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
        marvelDeck[23] = new Card(24, "FENRIS", 72, 50, 78, 10, 74);
        marvelDeck[24] = new Card(25, "SHURI", 65, 65, 25, 100, 60);
        marvelDeck[25] = new Card(26, "RONAN THE ACCUSER", 93, 86, 90, 85, 94);
        marvelDeck[26] = new Card(27, "MANDARIN", 86, 70, 81, 86, 70);
        marvelDeck[27] = new Card(28, "DRAX THE DESTROYER", 81, 84, 88, 20, 77);
        marvelDeck[28] = new Card(29, "DESTROYER", 83, 65, 84, 50, 70);
        marvelDeck[29] = new Card(30, "ODIN", 100, 75, 96, 99, 95);
        marvelDeck[30] = new Card(31, "WONG", 87, 2, 47, 90, 45);
        marvelDeck[31] = new Card(32, "KAECILIUS", 85, 60, 65, 80, 80);
        marvelDeck[32] = new Card(33, "BLACK WIDOW", 55, 97, 30, 80, 100);
        marvelDeck[33] = new Card(34, "RED SKULL", 55, 50, 60, 62, 60);
        marvelDeck[34] = new Card(35, "VISION", 94, 93, 94, 99, 82);
        marvelDeck[35] = new Card(36, "CORVUS GLAIVE", 76, 83, 63, 71, 82);
        marvelDeck[36] = new Card(37, "GROOT", 92, 40, 93, 20, 50);
        marvelDeck[37] = new Card(38, "WAR MACHINE", 84, 86, 84, 76, 78);
        marvelDeck[38] = new Card(39, "VALKYRIE", 87, 83, 85, 78, 87);
        marvelDeck[39] = new Card(40, "PROXIMA MIDNIGHT", 80, 92, 74, 78, 86);
        marvelDeck[40] = new Card(41, "OKOYE", 55, 87, 40, 68, 93);
        marvelDeck[41] = new Card(42, "DORMAMMU", 100, 75, 100, 95, 70);
        marvelDeck[42] = new Card(43, "HULKBUSTER", 93, 60, 97, 0, 81);
        marvelDeck[43] = new Card(44, "ROCKET RACCOON", 65, 98, 47, 90, 85);
        marvelDeck[44] = new Card(45, "QUICKSILVER", 75, 100, 30, 52, 45);
        marvelDeck[45] = new Card(46, "STAR-LORD", 76, 85, 50, 45, 78);
        marvelDeck[46] = new Card(47, "HAWKEYE", 62, 90, 40, 77, 91);
        marvelDeck[47] = new Card(48, "HELA", 99, 86, 97, 90, 95);
        marvelDeck[48] = new Card(49, "MANTIS", 75, 25, 10, 15, 5);
        marvelDeck[49] = new Card(50, "CAPTAIN MARVEL", 98, 93, 96, 91, 96);
        marvelDeck[50] = new Card(51, "SURTUR", 99, 20, 100, 75, 70);
        marvelDeck[51] = new Card(52, "HEIMDALL", 85, 75, 89, 82, 85);
        marvelDeck[52] = new Card(53, "ANCIENT ONE", 89, 20, 1, 90, 90);
        marvelDeck[53] = new Card(54, "AGATHA HARKNESS", 80, 50, 30, 70, 50);
        marvelDeck[54] = new Card(55, "GRANDMASTER", 30, 10, 5, 75, 15);
        marvelDeck[55] = new Card(56, "BLACK DWARF", 90, 50, 94, 30, 75);
        marvelDeck[56] = new Card(57, "WASP", 77, 100, 74, 70, 86);
        marvelDeck[57] = new Card(58, "PROFESSOR HULK", 95, 65, 98, 98, 65);
        marvelDeck[58] = new Card(59, "EBONY MAW", 95, 65, 98, 98, 65);
        marvelDeck[59] = new Card(60, "VULTURE", 95, 65, 98, 98, 65);

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

        //indicators for player who won the round and number of players in the game
        int pWinner = 0;
        int pWinnerA = 0;
        int pWinnerB = 0;
        int pWinnerC = 0;
        int pWinnerD = 0;

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

        //initialising indicators to store each players played rating for current and previous round
        int rp1 = 0;
        int rp2 = 0;
        int rp3 = 0;
        int rp4 = 0;
        int rp1Prv = 0;
        int rp2Prv = 0;
        int rp3Prv = 0;
        int rp4Prv = 0;

        //set indicator for which player/s is out, how many are out and who to ignore for certain rounds
        int pOut = 0;
        int pOut2 = 0;
        int pO = 0;

        int numOut = 0;

        int pIgnA = 0;
        int pIgnB = 0;


        //adjusting deck size to be divisible by number of players
        while (numCards % numP != 0) {
            numCards -= 1;
        }

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

        //main section of the game, only go through this if we have enough players left
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
                if (pOut == 1 && pOut2 != 3) {
                    playerInd = 2;
                    cardPlayedIdx = deck2.get(0);
                    cardChallengedIdxA = deck3.get(0);
                }
                else if (pOut == 2 && pOut2 != 3) {
                    cardPlayedIdx = deck1.get(0);
                    cardChallengedIdxA = deck3.get(0);
                }
                else if (pOut == 3 && pOut2 != 3) {
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
                    if (pOut == 1 && pOut2 != 2) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck3.get(0);
                    } else if (pOut == 2) {
                        playerInd = 3;
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 3 && pOut2 != 2) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 0) {
                        cardPlayedIdx = deck2.get(0);
                        cardChallengedIdxA = deck1.get(0);
                        cardChallengedIdxB = deck3.get(0);
                    }
                }
                else {
                    if (pOut == 1 && pOut2 != 3) {
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck2.get(0);
                    } else if (pOut == 2 && pOut2 != 3) {
                        cardPlayedIdx = deck3.get(0);
                        cardChallengedIdxA = deck1.get(0);
                    } else if (pOut == 3 && pOut2 != 3) {
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
                            cardChallengedIdxC = deck1.get(0);
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
                            cardChallengedIdxC = deck3.get(0);
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


            //setting up a matrix of length 4 to contain each of the player's score, finding who has tied (for when > 3p and there is a draw)
            int[] rpCur = {rp1, rp2, rp3, rp4};
            int maxRat = rpCur[0];

            for (int i = 1; i<4; i++) {
                if (rpCur[i] > maxRat) {
                    maxRat = rpCur[i];
                }
            }
            //now the largest value in every round is stored in maxRat



            //finding winner and assigning cards for 2p game
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
                    pWinner = 1;
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
                    pWinner = 2;
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
//finding winner and assigning cards for 3p game
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
                    pWinner = 1;
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
                    pWinner = 2;
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
                    pWinner = 3;
                }
                //draw only remaining possibility
                else {
                    //put cards into middle and go again
                    if (pOut != 1 && pOut2 != 1) {
                        drawDeck.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2 && pOut2 != 2) {
                        drawDeck.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3 && pOut2 != 3) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.print("\nDraw between ");
                    if (rp1 == maxRat) {
                        System.out.println("P1 and ");
                    }
                    if (rp2 == maxRat && rp3 != maxRat) {
                        System.out.print("P2. \n");
                    }
                    if (rp2 == maxRat && rp3 == maxRat) {
                        System.out.print("P2 and P3. \n");
                    }
                    if (rp3 == maxRat && rp2 != maxRat) {
                        System.out.print("P3.\n");
                    }
                }
                if (pOut != 1 || pIgnA == 1 || pIgnB == 1) {
                    System.out.print("P1 has " + deck1.size() + " cards. ");
                }
                if (pOut != 2 || pIgnA == 2 || pIgnB == 2) {
                    System.out.print("P2 has " + deck2.size() + " cards. ");
                }
                if (pOut != 3 || pIgnA == 3 || pIgnB == 3) {
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
                            numOut ++;
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
                        numOut ++;
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
                        numOut ++;
                    }
                }
            }
//finding winner and assigning cards for 4p game
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
                    pWinner = 1;
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
                    pWinner = 2;
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
                    pWinner = 3;
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
                    pWinner = 4;
                }
                //draw
                else {
                    //put cards into middle and go again
                    if (pOut != 1 && pOut2 != 1) {
                        drawDeck.add(deck1.get(0));
                        deck1.remove(0);
                    }
                    if (pOut != 2 && pOut2 != 2) {
                        drawDeck.add(deck2.get(0));
                        deck2.remove(0);
                    }
                    if (pOut != 3 && pOut2 != 3) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    if (pOut != 4 && pOut2 != 4) {
                        drawDeck.add(deck3.get(0));
                        deck3.remove(0);
                    }
                    System.out.print("\nDraw between ");
                    if (rp1 == maxRat) {
                        System.out.print("P1 and ");
                    }
                    if (rp2 == maxRat && rp3 != maxRat && rp4 != maxRat) {
                        System.out.print("P2. \n");
                    }
                    if (rp2 == maxRat && rp3 == maxRat && rp4 != maxRat) {
                        System.out.print("P2 and P3. \n");
                    }
                    if (rp3 == maxRat && rp2 != maxRat && rp4 != maxRat) {
                        System.out.print("P3. \n");
                    }
                    if (rp4 == maxRat && rp2 != maxRat && rp3 != maxRat) {
                        System.out.print("P4. \n");
                    }
                    if (rp4 == maxRat && rp2 != maxRat && rp3 == maxRat) {
                        System.out.print("P3 and P4. \n");
                    }
                    if (rp4 == maxRat && rp2 == maxRat && rp3 != maxRat) {
                        System.out.print("P2 and P4. \n");
                    }
                    if (rp4 == maxRat && rp2 == maxRat && rp3 == maxRat) {
                        System.out.print("P2, P3 and P4. \n");
                    }
                }
                if ((pOut != 1 && pOut2 != 1) || pIgnA == 1 || pIgnB == 1) {
                    System.out.print("P1 has " + deck1.size() + " cards. ");
                }
                if ((pOut != 2 && pOut2 != 2) || pIgnA == 2 || pIgnB == 2) {
                    System.out.print("P2 has " + deck2.size() + " cards. ");
                }
                if ((pOut != 3 && pOut2 != 3) || pIgnA == 3 || pIgnB == 3) {
                    System.out.print("P3 has " + deck3.size() + " cards. ");
                }
                if ((pOut != 4 && pOut2 != 4) || pIgnA == 4 || pIgnB == 4) {
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
                                numOut ++;
                            } else {
                                pOut2 = 1;
                                numOut ++;
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
                                numOut ++;
                            } else {
                                pOut2 = 2;
                                numOut ++;
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
                                numOut ++;
                            } else {
                                pOut2 = 3;
                                numOut ++;
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
                                numOut ++;
                            } else {
                                pOut2 = 4;
                                numOut ++;
                            }
                        }
                    }
                }
            }

            //setting variables to save each players score of the previous round
            rp1Prv = rp1;
            rp2Prv = rp2;
            rp3Prv = rp3;
            rp4Prv = rp4;

            //if in the previous round we had set certain players to be ignored, then we need to reset the pOut variable(s)
            if (pIgnA > 0) {
                pOut2 = 0;
            }
            if (pIgnB > 0) {
                pOut = 0;
                pOut2 = 0;
            }
            //resetting indicators for which players to ignore next round if not another draw
            if (drawDeck.isEmpty() && numP > 2) {
                pIgnA = 0;
                pIgnB = 0;
            }
            //if there was a draw we need to see who drew and who scored lower, so that we can ignore their card the next round
            if (!drawDeck.isEmpty() && numP > 2) {
//calling the draw/lose indicator array
                int[] dIndArr = findDrawers(rp1, rp2, rp3, rp4);
                //loop through draw ind array to find indicators, 0 in the array means we're ignoring them
                for (int i = 0; i<4; i++) {
                    if (dIndArr[i] == 0) {
                        //setting ignore indicator(s) to the player
                        //only set second indicator if weve assigned the first one
                        if (pIgnA != 0) {
                            pIgnB = i + 1;
                        } else if (pIgnA == 0) {
                            pIgnA = i + 1;
                        }
                    }
                        //setting the winners of the round
                    else if (dIndArr[i] == 1) {
                        if (pWinnerA == 0) {
                            pWinnerA = i + 1;
                        }
                        else if (pWinnerA != 0 && pWinnerB != 0) {
                            pWinnerC = i + 1;
                        }
                        else if (pWinner != 0){
                            pWinnerB = i + 1;
                        }
                    }
                  }
                               //array of which players drew eg. [1, 3, 0, 0]: 2 would be out of the next round i.e pIgnA = 2
                int[] whoDrew = {pWinnerA, pWinnerB, pWinnerC, pWinnerD};
                //count number of nonzero elements
                int numDrawers = 0;
                int numDout = 0;
                for (int i = 0; i<4; i++) {
                    //number of players who drew
                    if (whoDrew[i] > 0) {
                        numDrawers++;
                    }
                    // if player drawing also has no cards left
                    if (whoDrew[i] > 0 && (pOut == whoDrew[i] || pOut2 == whoDrew[i])) {
                        numDout += 1;
                    }
                }

                for (int i = 0; i<4; i++) {
                                      //if drawing player still has cards
                            if (whoDrew[i] > 0 && whoDrew[i] != pOut && whoDrew[i] != pOut) {

                            //if we have one drawer with cards remaining
                            if (numDrawers == numDout + 1){
                                for (int j = 0; j < drawDeck.size(); j++) {
                                    if (pWinnerA == 1) {
                                        deck1.add(drawDeck.get(j));
                                    }
                                    if (pWinnerA == 2) {
                                        deck2.add(drawDeck.get(j));
                                    }
                                    if (pWinnerA == 3) {
                                        deck3.add(drawDeck.get(j));
                                    }
                                    if (pWinnerA == 4) {
                                        deck4.add(drawDeck.get(j));
                                    }
                                    drawDeck.removeAll(drawDeck);
                            }
                        }
                    }
                }

                //setting the players to ignore as out, the pOut values will switch back following next round
                //if we have stored a value in the second ignore variable we can use the first pOut variable 4p need to
                //be active for pIgnB to have a value
                if (pOut != 0 && pIgnA != pOut) {
                    pOut2 = pIgnA;
                }
                if (pOut == 0) {
                    pOut = pIgnA;
                }
                if (pOut != 0 && pOut2 == 0 && pIgnB != 0) {
                    pOut2 = pIgnB;
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
