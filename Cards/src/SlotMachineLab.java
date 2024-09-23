import java.util.Scanner;

public class SlotMachineLab {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the casino");

        System.out.println("How much money do you have: ");
        double money = input.nextDouble();

        System.out.println("What is the bet amount: ");
        double bet = input.nextDouble();

        gamble(money, bet);
        // 15 possibilities per wheel

    }

    public static void gamble(double money, double bet) {
        System.out.println("gamble");

        int wheel1 = (int) (Math.random() * 15);
        int wheel2 = (int) (Math.random() * 15);
        int wheel3 = (int) (Math.random() * 15);

        

        System.out.println("_________________");
        System.out.println("|   LUCKY 777   |");
        System.out.println("|---------------|");
        System.out.println("|   W   O   W   |");
        System.out.println("|---------------|");
        System.out.println("_________________");

    }
}
