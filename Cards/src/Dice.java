import java.util.Scanner;
public class Dice {
    public static void main(String[] args) throws Exception {
        double money = 100.0;
        double bet;
        Scanner input = new Scanner(System.in);

        System.out.println("Bet: ");
        bet = input.nextDouble();



        int roll = (int)(Math.random()*6) + 1 + (int)(Math.random()*6) + 1;
        if(roll == 7 || roll == 11) {
            System.out.println("Congrats on winning!");
            money += bet;
        }

        else if (roll == 2 || roll == 3 || roll == 12) {
            System.out.println("Sorry, you lost...");
            money -= bet;
        }
        int newroll;
        do {
            newroll = (int)(Math.random()*6) + 1 + (int)(Math.random()*6) + 1;
        }while(newroll !=7 && newroll != roll);
        if(newroll == 7) {
            System.out.println("You lost!");
            money -= bet;
        }
        else {
            System.out.println("Congrats on winning!");
            money += bet;
        }
        

        //7, 11 to insta win
        //2, 3, 12 insta lose

        //else roll until
        //7 = insta lose
        //match first == insta win

    }
}
