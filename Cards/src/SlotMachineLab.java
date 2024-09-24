import java.util.Scanner;

public class SlotMachineLab {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to manually play, and 2 to simulate.");
        int gamemode = input.nextInt();
        while (gamemode == 1) {
            manuelgamble();
            System.out.println("Enter 1 to play again, and 0 to stop playing.");
            int playagain = input.nextInt();
            if (playagain != 1) {
                break;
            }
        }

        while (gamemode == 2) {
            System.out.println("Simulating is not set up yet");
        }

        input.close();
    }

    public static void manuelgamble() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the casino");

        System.out.println("How much money do you have: ");
        double money = input.nextDouble();

        System.out.println("What is the bet amount: ");
        double bet = 1.0;
        do{
            if(bet > money)
            System.out.println("You cant bet more than you have! What is your bet: ");
            if(bet < 1)
            System.out.println("You cant bet less than a dollar! What is your bet: ");
            bet = input.nextDouble();
        }while(bet > money || bet < 1);

        gamble(money, bet, true);
    }

    public static void gamble(double money, double bet, boolean showdisp) {
        System.out.println("gamble");

        int wheel1 = (int) (Math.random() * 15);
        int wheel2 = (int) (Math.random() * 15);
        int wheel3 = (int) (Math.random() * 15);
        String letter1 = wheel1letter(wheel1);
        String letter2 = wheel2letter(wheel2);
        String letter3 = wheel3letter(wheel3);


        if(showdisp) {
        System.out.println("_________________");
        System.out.println("|   LUCKY 777   |");
        System.out.println("|---------------|");
        System.out.println("|   " + letter1 + "   " + letter2 + "   " + letter3 + "   |");
        System.out.println("|---------------|");
        System.out.println("_________________");
        }

        String word = letter1 + letter2 + letter3;
        System.out.println(word);

        if (word == "W" + "I" + "N") {
            System.out.println("5x payout! WIN!");
        }
        if (word == "WAM") {
            System.out.println("10x payout! WAM!");
        }
        if (word == "WOW") {
            System.out.println("20x payout! WIN!");
        }
    }

    public static String wheel1letter(int number) {
        String letter1 = "ERROR"; //prints error if it breaks
        if(number < 9 && number >= 0) {
            letter1 = "W";
        }
        if(number < 12 && number >= 9) {
            letter1 = "X";
        }
        if(number < 15 && number >= 12) {
            letter1 = "Z";
        }
        return letter1;
    }
    public static String wheel2letter(int number) {
        String letter1 = "ERROR"; //prints error if it breaks
        if(number < 5 && number >= 0) {
            letter1 = "I";
        }
        if(number < 10 && number >= 5) {
            letter1 = "Y";
        }
        if(number < 13 && number >= 10) {
            letter1 = "A";
        }
        if(number < 15 && number >= 13) {
            letter1 = "O";
        }
        return letter1;
    }
    public static String wheel3letter(int number) {
        String letter1 = "ERROR"; //prints error if it breaks
        if(number < 6 && number >= 0) {
            letter1 = "N";
        }
        if(number < 12 && number >= 6) {
            letter1 = "M";
        }
        if(number < 15 && number >= 12) {
            letter1 = "W";
        }
        return letter1;
    }
}
