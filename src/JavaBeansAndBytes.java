import java.awt.*;
import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    private String name;
    private boolean isOpen;
    private int yearFounded;
    private String drink;
    private int rand;
    public CoffeeDrink LemonyFresh;
    public CoffeeDrink CreamyBerry;


    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();

    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 2007;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence $

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay(drink);



        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
       LemonyFresh = new CoffeeDrink(2, "Lemon", true);
       CreamyBerry = new CoffeeDrink(4, "Berry", true);
        LemonyFresh.printInfo();
        CreamyBerry.printInfo();
        LemonyFresh.setFlavor("water");
        String newSpecial = CreamyBerry.getFlavor();
        specialOfTheDay(newSpecial);


        // TODO
        // Print out the order details


    }

    // Method to generate a random discount
    public void randomDiscount() {

            int x = (int) (Math.random() * 31);
            System.out.println("You have recieved " +x+"% discount today");
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String specialDrink)
    {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        this.drink = specialDrink;
        System.out.println("The special of the day is " + this.drink + ".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");


        for (int x = 1; x < 6; x++){
            System.out.println(x);
        }
        for (int x = 2; x < 12; x=x+3){
            System.out.println(x);
        }
        for (int x = 8; x > -1; x=x-1){
            System.out.println(x);
        }



        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5


        // Print 2, 5, 8, 11


        // Print 8 to 0

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double bradford = Math.random();
        if(bradford< .25) {
            System.out.println("water");
        }
        else if(bradford <.5) {
            System.out.println("chocolate milk");
        }
        else if (bradford< .75){
            System.out.println("apple juice");
        }
        else{
            System.out.println("lemonade");
        }
    }

}


