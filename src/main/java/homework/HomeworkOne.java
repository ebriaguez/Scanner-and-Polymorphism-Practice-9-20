package homework;

import java.util.Scanner;

public class HomeworkOne {
    /*Prompt a user to enter if they think the temperature is High, Low or Humid
Based on the user's input print out one of these
High: print out " sunblock may be needed"
Low : print out " a coat may be needed"
Humid: print out " it's muggy!"*/
    public static void main(String[] args) {
        //Declare variables
        String printHigh = "Sunblock may be needed";
        String printLow = "A coat may be needed";
        String printHumid = "It's muggy!";
        String askUser = "Enter temperature (High, Low, or Humid):";
        String error = "Error, please input High, Low, or Humid";
        //Scanner object
        Scanner userInput = new Scanner(System.in);
        //Print question
        System.out.println(askUser);
        //store input
        String input = userInput.nextLine();
        //if statement which prints out
        if(input.equalsIgnoreCase("high")){
            System.out.println(printHigh);
        } else if (input.equalsIgnoreCase("low")){
            System.out.println(printLow);
        } else if (input.equalsIgnoreCase("humid")){
            System.out.println(printHumid);
        } else {
            System.out.println(error);
        }
        userInput.close();
    }
}
