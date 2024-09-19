public class App {
    public static void main(String[] args) throws Exception {
        
        //int s = (int)(Math.random()*4);
        //int r = (int)(Math.random()*13); //[0-12]
        //char suit = getsuit(s);




        //dealing out cards till you get a jack of hearts
        //System.out.println(r + 1 + ", " + suit);
        /* 
        do { //1/52 odds
            s = (int)(Math.random()*4);
            r = (int)(Math.random()*13); //[0-12]
            suit = getsuit(s);
            System.out.println(r + ", " + suit);
        } while(!(r==11&&s==0));*/
     
        double money = 0;
        for (int i = 0; i < 1000000; i++) { //average loss of 4 pennies per person.
            money--;
            int s = (int)(Math.random()*4);
            int r = (int)(Math.random()*13); //[0-12]

            if(s==2) {
                money+=2;
            }
            if(r==0){
                money+=6;
            }
        }
        System.out.println("money = " + money);




    }

    public static char getsuit(int n) { //uses ASCII
        char finalvari;
        switch (n){
            case 0: //white heart
            return (char)3; 
            case 1: //white diamond
            return (char)4;
            case 2: //white clubs
            return (char)5;
            case 3: //white thing (spades)
            return (char)6;
            default:
            finalvari = 0;
            return finalvari;
        }
    }

}
