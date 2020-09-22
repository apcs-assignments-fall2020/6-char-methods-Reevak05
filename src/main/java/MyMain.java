import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((ch>=65) && (ch<=91)) return (char)(ch+32);
        else return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String lowered = "";
        for (int i = 0; i<str.length();i++) {
            if ((str.charAt(i)>=65) && (str.charAt(i)<=91)) lowered += (char)(32+str.charAt(i));
            else lowered += str.charAt(i);
        }
        return lowered;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if ((ch>=97) && (ch<=122)) return (char)(ch-32);
        else return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String uppered = "";
        for (int i = 0; i<str.length();i++) {
            if ((str.charAt(i)>=97) && (str.charAt(i)<=122)) uppered += (char)(str.charAt(i)-32);
            else uppered += str.charAt(i);
        }
        return uppered;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string you would like to change the case of: ");
        String words = scan.nextLine();
        System.out.println("Would you like to convert to uppercase or lowercase? ");
        String choice = scan.next();
        if ((myToLowerCase(choice).equals("lowercase"))||(myToLowerCase(choice).equals("lower"))||(myToLowerCase(choice).equals("l"))) System.out.println(myToLowerCase(words));
        else if ((myToLowerCase(choice).equals("uppercase"))||(myToLowerCase(choice).equals("upper"))||(myToLowerCase(choice).equals("u"))) System.out.println(myToUpperCase(words));
        else System.out.println("Error. Please try again.");
        scan.next();
    }
}
