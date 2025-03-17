//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void guessNum(int randomNum, String userNum){
        int intUserNum = Integer.parseInt(userNum);
        Scanner scanner = new Scanner(System.in);
        while(randomNum != intUserNum){
            System.out.println("Incorrect! " + userNum + " is not the correct number!");
            System.out.println("Try again");
            userNum = scanner.nextLine();
            intUserNum = Integer.parseInt(userNum);
        }
        System.out.println("Correct! " + userNum + " is the correct number!");
    }

    public static void main(String[] args) {
        Random rand = new Random(); // Random is a class in Java from Line 3
                                    // rand is the variable of type random
                                    // new creates a new instance or object of a class

        System.out.println("Can you guess the number from 1- 10? ");
        String userNum = scanner.nextLine();
        int randomNum = rand.nextInt(10);
        guessNum(randomNum, userNum);
    }
}
