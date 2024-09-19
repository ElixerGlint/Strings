public class App {
    public static void main(String[] args) throws Exception {
        
        int s = (int)(Math.random()*4);
        int r = (int)(Math.random()*13); //[0-12]
        char suit = getsuit(s);

        System.out.println(r + ", " + suit);
    }



    public static char getsuit(int n) { //uses ASCII
        char finalvari;
        switch (n){
            case 0: 
            return (char)3; //black spades
            case 1:
            //black club
            return (char)4;
            case 2:
            return (char)5; //white heart
            case 3:
            return (char)6; //white diamond
            default:
            finalvari = 0;
            return finalvari;
        }
    }

}
