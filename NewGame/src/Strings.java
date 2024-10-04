public class Strings {
    public static void main(String[] args) throws Exception {
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

    } // close main
} // close class
