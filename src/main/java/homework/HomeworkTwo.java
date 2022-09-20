package homework;

import java.util.Scanner;

public class HomeworkTwo {
    /*Polymorphism Lab 1
Instructions
Part 1:
Create a program that asks the user how many pets they have.
Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.
For now your program should just hold onto the user input and print out the list at the end; we'll modify this in part 3.

Part 3:
Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user lists and at the end of the program print out a list of their names and what they say when they speak.*/

    public static void main(String[] args) {
        //PART 1

        //Declare variables
        String howMany = "How many pets do you have?";
        String whatKind = "What kind of pet do you have?";
        String petName = "What is your pet's name?";

        //Create Scanner object
        Scanner userInput = new Scanner(System.in);

        //print first question
        System.out.println(whatKind);

        //store user input
        String resultTwo = userInput.nextLine();

        //print second question
        System.out.println(howMany);

        //store user input
        int resultOne = userInput.nextInt();

        //to avoid bugs, include nextLine();
        userInput.nextLine();

        //print next question
        System.out.println(petName);

        //store user input
        String resultThree = userInput.nextLine();

        //print all
        String printUserInput = resultOne + "\n" + resultTwo + "\n" + resultThree;
        System.out.println(printUserInput);
        //close
        userInput.close();
    }
}
