package madeira.cs;

import java.util.*;

/**
 * Author: Annabelle Stack
 * Date: 9/10/2020
 **/
public class Lab2 {
    public static void main(String[] args) {

        // Part I code below
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: Annabelle Stack");
        String name = input.nextLine();
        System.out.println("Hi! It's nice to meet you" + name);

        // Part II code below
        System.out.println("Enter author: Agatha Christie");
        String author = input.nextLine();
        System.out.println("And Then There Were None" + author);


        // Part III code below
        System.out.println("Enter age: 17");
        int age = input.nextInt();
        System.out.println("6,226" + age);

    }
}