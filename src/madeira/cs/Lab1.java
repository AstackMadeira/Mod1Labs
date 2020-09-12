package madeira.cs;

/**
 * Author: Annabelle Stack
 * Date: 9/10/2020
 **/
public class Lab1 {
    public static void main(String[] args) {

        // Part I code below
        String myString1;
        myString1 = "Hello?";
        String myString2;
        myString2 = "Can you hear me?";
        String myString3;
        myString3 = "I can hear you";
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);

        // Part II code below
        myString1 = "Are you okay?";
        myString2 = "What's Wrong?";
        myString3 = "I hope you feel better!";
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);

        // Part III code below
        System.out.println(myString1.length());
        System.out.println(myString1.concat(myString2));
        System.out.println(myString1.equals(myString2));
    }
}
