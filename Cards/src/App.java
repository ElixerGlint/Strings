public class App {
    public static void main(String[] args) throws Exception {
        
        int s = (int)(Math.random()*4);
        int r = (int)(Math.random()*13); //[0-12]
        char suit = getsuit(s);




        //dealing out cards till you get a jack of hearts
        System.out.println(r + 1 + ", " + suit);
        
        do { //1/48 odds
            s = (int)(Math.random()*4);
            r = (int)(Math.random()*13); //[0-12]
            suit = getsuit(s);
            System.out.println(r + ", " + suit);
        } while(!(r==11&&s==0));
        
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
