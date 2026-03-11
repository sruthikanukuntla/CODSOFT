import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while(guess != number){
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();

            if(guess < number){
                System.out.println("Too low!");
            }
            else if(guess > number){
                System.out.println("Too high!");
            }
