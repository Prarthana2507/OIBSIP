import java.util.Objects;
import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {
        String RegisteredUsername, Username;
        String RegisteredPassword, Password;
        int ch1,ch2 = 0;
        int Balance = 0;

        System.out.println("Register yourself");

        System.out.println("Enter your name: ");
        Scanner sc1 = new Scanner(System.in);
        String Name = sc1.next();

        System.out.println("Enter your username: ");
        Scanner sc2 = new Scanner(System.in);
        RegisteredUsername = sc2.next();

        System.out.println("Enter your password: ");
        Scanner sc3 = new Scanner(System.in);
        RegisteredPassword = sc3.next();

        System.out.println("Registered Successfully!!!");

        System.out.println("Select choice");
        System.out.println("1. Login to your account");
        System.out.println("2. Exit");
        Scanner sc8 = new Scanner(System.in);
        ch1 = sc8.nextInt();

            if (ch1 == 1) {
                System.out.println("Enter your username");
                Scanner sc4 = new Scanner(System.in);
                Username = sc4.next();

                System.out.println("Enter your password");
                Scanner sc5 = new Scanner(System.in);
                Password = sc5.next();

                if (Objects.equals(Username, RegisteredUsername) && Objects.equals(Password, RegisteredPassword)) {
                    System.out.println("Welcome " + Name);

                    while (ch2 != 4) {
                        System.out.println("Select choice");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.View balance");
                        System.out.println("4.Exit");
                        Scanner choice2 = new Scanner(System.in);
                        ch2 = choice2.nextInt();
                        switch (ch2) {
                            case 1 -> {
                                System.out.println("Enter amount to deposit:");
                                Scanner sc6 = new Scanner(System.in);
                                int Deposit = sc6.nextInt();
                                Balance = Balance + Deposit;
                            }
                            case 2 -> {
                                System.out.println("Enter amount to withdraw:");
                                Scanner sc7 = new Scanner(System.in);
                                int Withdraw = sc7.nextInt();
                                if (Balance >= Withdraw) {
                                    Balance = Balance - Withdraw;
                                } else {
                                    System.out.println("Insufficient balance");
                                }
                            }
                            case 3 -> System.out.println("Your balance is: " + Balance);
                            case 4 -> System.out.println("Thank you");
                            default -> System.out.println("Invalid choice");
                        }
                    }
                } else {
                    System.out.println("Incorrect password");
                    System.out.println("Try again");
                }
            }
        else if (ch1 == 2) {
                System.out.println("Thank you");
            }
        else {
                System.out.println("Invalid choice");
        }
    }
}


