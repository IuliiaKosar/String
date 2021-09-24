package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        /*
        ask user how many names of people they want to store
        get names from user to save
        store those names in an String array
        print out those names by using toString method
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("How many names of people do you want to store?");
        int size = scr.nextInt();
        scr.nextLine();
        String [] names = new String[size];


        for (int i = 0; i < size; i++){
            System.out.println("Please enter name");
            names [i] = scr.nextLine();

        }

        System.out.println(Arrays.toString(names));
    }
}
