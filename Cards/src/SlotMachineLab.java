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
        // 9 Ws, 3 Zs, 3 Xs
        String letter1 = wheel1letter(wheel1);
        String letter2 = wheel2letter(wheel2);
        int wheel2 = (int) (Math.random() * 15);
        int wheel3 = (int) (Math.random() * 15);



        System.out.println("_________________");
        System.out.println("|   LUCKY 777   |");
        System.out.println("|---------------|");
        System.out.println("|   " + letter1 + "   " + letter2 + "   W   |");
        System.out.println("|---------------|");
        System.out.println("_________________");

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
        //broken rn
        return letter1;
    }
}
