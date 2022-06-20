import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int Number;
        int UserInput;
        int Score = 0;
        int Chance = 7;
        int Trial = 1 ;
        Number = (int) (Math.random() * 100);
        System.out.println("Guess a number between 1-100");
        System.out.println("You have 7 chances to go...");
        System.out.println("Good Luck!!!");
        do {
            System.out.println("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            UserInput = sc.nextInt();
            if (Trial < Chance) {
                if (UserInput == Number) {
                    System.out.println("you won!!!");
                    break;
                }
                else if (UserInput > Number) {
                    System.out.println("Number too large");
                }
                else
                    System.out.println("Number too small");
                Trial++;
                Score = (Chance - Trial + 1) * 100 /Chance;
            }
            else if(Trial == Chance && UserInput == Number) {
                    System.out.println("you won!!!");
                    break;
            }
            else {
                System.out.println("Out of chances...Better luck next time");
                Score = 0;
                break;
            }
        }
        while(UserInput > 0);
        System.out.println("The number is: " + Number);
        if(UserInput > 0) {
            System.out.println("Total score = " + Score + "%");
        }
        else {
            System.out.println("Wanna try again...");
        }
        System.out.println("press 1 to play again and 0 to exit: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            main(args);
        } else {
            System.out.println("Thank you");
        }
    }
}

