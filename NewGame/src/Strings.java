public class Strings {
    public static void main(String[] args) throws Exception {
        /* 
        String str = "Hello World";
        String str2 = "Hello World";
        System.out.println(str == str2);// same object, therefore it is true
        String str3 = str.substring(0, 4) + "o " + str2.substring(6);
        System.out.println(str == str3); // should be the same, but it is a different object
        System.out.println(str.equals(str3)); // same value, therefore true
        // compareTo
        String A = "A";
        String B = "B";//a - b
        System.out.println(A.compareTo(B)); //shoud be -1, based on numerical values of the characters
        System.out.println(str.compareTo("Hey")); //-13 because first difference, then kicks out
        System.out.println("A".compareTo("a")); //uppercase letters come before lowercase in unicode
        System.out.println("Cat".compareTo("Cataract")); //ran out of chars to compare, so it compares their counts
        */

        //snatch up every third word to create
        String scentance = "Ive been workingo on the railroad all the live long day";
        System.out.println(thirdWord(scentance));


    } // close main

    public static String thirdWord(String scentance) {
        int space = scentance.indexOf(' ');
        String output = "";
        if(space == -1) {
            return output;
        }






        

        return output;
    }
} // close class
