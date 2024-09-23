import java.util.Scanner;
public class SlotMachineLab {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the casino");
        System.out.println("What is the bet amount: ");
        double money = 0;
        double bet = input.nextDouble();

        gamble();
        //15 possibilities per wheel


    }

    public static void gamble() {
        System.out.println("gamble");

        int wheel1 = (int)(Math.random() * 15);
        int wheel2 = (int)(Math.random() * 15);
        int wheel3 = (int)(Math.random() * 15);


        System.out.println("_________________");
        System.out.println("|   LUCKY 777   |");
        System.out.println("|---------------|");
        System.out.println("|   W   O   W   |");
        System.out.println("|---------------|");
        System.out.println("_________________");
        
    }
}
