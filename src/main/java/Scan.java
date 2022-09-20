import java.util.Scanner;


public class Scan {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scans.nextLine();
        System.out.println("What is your age?");
        int age = scans.nextInt();
        scans.nextLine(); //USE THIS instead of Scanner scans - new Scanner(System.in);
        System.out.println("Favorite color");
        String color = scans.nextLine();
        System.out.println("My name is " + name + " and my age is " + age + " and color is " + color);
        scans.close(); //closing a scanner
    }
}
