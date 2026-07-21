import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;
        System.out.println("Guess the number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > target)
                System.out.println("Too High!");
            else if (guess < target)
                System.out.println("Too Low!");
            else
                System.out.println("Congratulations! You guessed the correct number.");
        } while (guess != target);   
    }
}
