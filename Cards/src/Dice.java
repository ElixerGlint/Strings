import java.util.Scanner;
public class Dice {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the cacino");
        System.out.println("What is the bet amount: ");
        double bet = input.nextDouble();
        System.out.println("How many rounds would you like to simulate");
        int count = input.nextInt();

        System.out.println(simulate(bet,count));

    }

    public static double simulate(double bet, double count) {
        double money = 0;
        for(int i = 0; i< count; i++) {
        int roll = (int)(Math.random()*6) + 1 + (int)(Math.random()*6) + 1;
        if(roll == 7 || roll == 11) {
            money += bet;
        }

        else if (roll == 2 || roll == 3 || roll == 12) {
            //loss
            money -= bet;
        }
        int newroll;
        do {
            newroll = (int)(Math.random()*6) + 1 + (int)(Math.random()*6) + 1;
        }while(newroll !=7 && newroll != roll);
        if(newroll == 7) {
            //loss
            money -= bet;
        }
        else {
            //win
            money += bet;
        }
    }
        return money;
    }
}
