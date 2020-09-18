package madeira.cs;

import java.util.*;

/**
 * Author: Annabelle Stack
 * Date: 9/17/2020
 **/
public class Lab3 {
    public static void main(String[] args) {

        // Part I code below
        int age = 17;
        if (age >= 17) {
            System.out.println("You are old enough to drive.");
        } else if (age >= 18) {
            System.out.println("You are old enough to get a tattoo.");
        } else if (age >= 35) {
            System.out.println("You are old enough to run for president of the US.");
        } else if (age < 17) {
            System.out.println("You are not old enough to drive.");
        } else if (age < 18) {
            System.out.println("You are not old enough to get a tattoo.");
        } else if (age < 35) {
            System.out.println("You are not old enough to run for president of the US.");
        }

        // Part II code below
        String BirthdayMonth = "January";

        if (BirthdayMonth.equals("January")) {
            System.out.println("Capricorn");
        } else if (BirthdayMonth.equals("February")) {
            System.out.println("Aquarius");
        } else if (BirthdayMonth.equals("March")) {
            System.out.println("Pisces");
        } else if (BirthdayMonth.equals("April")) {
            System.out.println("Aries");
        } else if (BirthdayMonth.equals("May")) {
            System.out.println("taurus");
        } else if (BirthdayMonth.equals("June")) {
            System.out.println("Gemini");
        } else if (BirthdayMonth.equals("July")) {
            System.out.println("Caner");
        } else if (BirthdayMonth.equals("August")) {
            System.out.println("Leo");
        } else if (BirthdayMonth.equals("September")) {
            System.out.println("Virgo");
        } else if (BirthdayMonth.equals("October")) {
            System.out.println("Libra");
        } else if (BirthdayMonth.equals("November")) {
            System.out.println("Scorpio");
        } else if (BirthdayMonth.equals("December")) {
            System.out.println("Sagittarius");
        }

        String SeasonMonth = "January";

        if (SeasonMonth.equals("December") || SeasonMonth.equals("January") || SeasonMonth.equals("February")) {
            System.out.println("Winter");
        } else if (SeasonMonth.equals("March") || SeasonMonth.equals("April") || SeasonMonth.equals("May")) {
            System.out.println("Spring");
        } else if (SeasonMonth.equals("June") || SeasonMonth.equals("July") || SeasonMonth.equals("August")) {
            System.out.println("Summer");
        } else if (SeasonMonth.equals("September") || SeasonMonth.equals("October") || SeasonMonth.equals("November")) {
            System.out.println("Autumn");
        }

        String DaysMonth = "January";

        if (DaysMonth.equals("January")) {
            System.out.println("31");
        } else if (DaysMonth.equals("February")) {
            System.out.println("28");
        } else if (DaysMonth.equals("March")) {
            System.out.println("31");
        } else if (DaysMonth.equals("April")) {
            System.out.println("30");
        } else if (DaysMonth.equals("May")) {
            System.out.println("31");
        } else if (DaysMonth.equals("June")) {
            System.out.println("30");
        } else if (DaysMonth.equals("July")) {
            System.out.println("31");
        } else if (DaysMonth.equals("August")) {
            System.out.println("31");
        } else if (DaysMonth.equals("September")) {
            System.out.println("30");
        } else if (DaysMonth.equals("October")) {
            System.out.println("31");
        } else if (DaysMonth.equals("November")) {
            System.out.println("30");
        } else if (DaysMonth.equals("December")) {
            System.out.println("31");
        }



        // Part III code below
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter birth year:");
        int BirthYear = input1.nextInt();
        System.out.println(2020 + " - " + BirthYear + " = " + (2020 - BirthYear));

        System.out.println("Enter birth month(numerical):");
        int BirthMonth = input1.nextInt();
        System.out.println(9 + " - " + BirthMonth + " = " + (9 - BirthMonth));

        System.out.println("Enter birth days:");
        int BirthDays = input1.nextInt();
        System.out.println(17 + " - " + BirthDays + " = " + (17 - BirthDays));

        int DaysAlive = (2020 - BirthYear) * 365 + (9 - BirthMonth) * 30 + (17 - BirthDays);
        System.out.println("Days you have been alive: " + DaysAlive);

        }
    }