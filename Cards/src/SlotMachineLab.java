import java.util.Scanner; //imports

public class SlotMachineLab {

    public static void main(String[] args) throws Exception { //main loop
        Scanner input = new Scanner(System.in); //creating the scanner

        System.out.println("Enter 1 to manually play, and 2 to simulate.");
        int gamemode = input.nextInt(); //initializing variables
        double money = 100.0;

        while (gamemode == 1) { //manual gambling
            money = manuelgamble(money); //calling the function to gamble, output is the ending money value.
            if(money < 1) { //if they have no money, they get kicked out
                    System.out.println("You cant gamble without money! GET OUT!");
                    break;
                }
            System.out.println("Enter 1 to play again, and 0 to stop playing."); //asking the manuel player if they would like to play again
            int playagain = input.nextInt();
            if (playagain != 1) {
                if(playagain != 1)
                    System.out.println("Come back soon!"); //if they leave, you gotta thank them for coming, in hopes they come back
                break;
            }
        }

        while (gamemode == 2) { //automatic gambling
            money = 0;
            System.out.println("How many rounds should I simulate (enter an interger)?"); //inputs
            int rounds = input.nextInt();

            System.out.println("How much money will the bot gamble per turn");
            double gambleamount = input.nextDouble();

            double changeinmoney = 0.0;

            for (int i = 0; i < rounds; i++) { //auto gambling until the rounds have exausted
                changeinmoney += autogamble(money, gambleamount);
            }

            if(changeinmoney > 0) //telling the results
                System.out.println("You gained " + changeinmoney + "$!");

            if(changeinmoney < 0)
                System.out.println("You lost " + Math.abs(changeinmoney) + "$!"); 
            
            if(changeinmoney==0)
                System.out.println("Somehow you stayed perfectly even on profit.");
            break;
        }

        input.close();
    }

    public static double manuelgamble(double money) { //manually gambling, with the money. Returns the final money amount
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the casino. You have " + money + "$."); //welcoming the player

        System.out.println("What is the bet amount: "); //inputs
        double bet = 1.0;
        do{
            if(bet > money) //fault protection
            System.out.println("You cant bet more than you have! What is your bet: ");
            if(bet < 1.0)
            System.out.println("You cant bet less than a dollar! What is your bet: ");
            bet = input.nextDouble();
        }while(bet > money || bet < 1);

        money = gamble(money, bet, true); //gamble with the money
        
        return money;
    }

    public static double autogamble(double money, double bet) { //gamble the money (called in the for loop)
        money = gamble(money, bet, false);
        return money;
    }

    public static double gamble(double money, double bet, boolean showdisp) { //manual gamble

        int number1 = (int) (Math.random() * 15); //generating the slots
        int number2 = (int) (Math.random() * 15);
        int number3 = (int) (Math.random() * 15);
        String letter1 = wheel1letter(number1);
        String letter2 = wheel2letter(number2);
        String letter3 = wheel3letter(number3);


        if(showdisp) { //printing the terminal to look nice
        System.out.println("_________________");
        System.out.println("|   LUCKY 777   |");
        System.out.println("|---------------|");
        System.out.println("|   " + letter1 + "   " + letter2 + "   " + letter3 + "   |");
        System.out.println("|---------------|");
        System.out.println("_________________");
        }

        String word = letter1 + letter2 + letter3; //creating the word from the letters


        double updatedmoney = money;
        //does not register for some reason
        if (word.equals("WIN")) { //determining payout/loss on the word
            updatedmoney += bet*5; //updates the money with the payout
            if(showdisp) //if the display is on
            System.out.println("5x payout! WIN!"); //SAY CONGRATS!!!!
        }
        if (word.equals("WAM")) { //^
            updatedmoney += bet*10;
            if(showdisp)
            System.out.println("10x payout! WAM!");
        }
        if (word.equals("WOW")) {//^
            updatedmoney += bet*20;
            if(showdisp)
            System.out.println("20x payout! WIN!");
        }
        if (!(word.equals("WOW") || word.equals("WAM") || word.equals("WIN"))) { //^
            updatedmoney -=bet;
            if(showdisp)
            System.out.println("You lost your entire bet...");
        }

        return updatedmoney;
    }

    public static String wheel1letter(int number) { //generates the first letter (based on predetermined odds)
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
    public static String wheel2letter(int number) {//generates the second letter
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
    public static String wheel3letter(int number) { //generates the third letter
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
//:)