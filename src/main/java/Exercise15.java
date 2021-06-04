/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        String password = scan.nextLine();
        if(password.compareTo("Lebron_James") == 0){
            System.out.print("Password is correct!");
        }

        else{
            System.out.print("Wrong password, try again");
        }


    }
}