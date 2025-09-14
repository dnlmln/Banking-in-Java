import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("");
            System.out.println("*******************************");
            System.out.println("******  BANKING PROGRAM  ******");
            System.out.println("*******************************");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Quit");
            System.out.println("*******************************");

            // Get and Process Users Input
            System.out.print("Enter your choice (1-4):   ");
            choice = sc.nextInt();
            System.out.println("");


            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice.");
            }


        }

        System.out.println("Have a nice day!");
        sc.close();
    }

    static void showBalance(double balance){
        System.out.println("*******************************");
        System.out.printf("Your balance: $%.2f \n", balance);
        System.out.println("*******************************");
    }

    static double deposit(){
        double amount;
        System.out.print("Enter amount of deposit: ");
        amount = sc.nextDouble();
        if(amount < 0){
            System.out.println("\n*******************************");
            System.out.println("Deposit can't be negative.");
            System.out.println("*******************************");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount withdrawal: ");
        amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("\n*******************************");
            System.out.println("Insufficient Funds.");
            System.out.println("*******************************");
            return 0;
        }
        else if(amount < 0){
            System.out.println("\n*******************************");
            System.out.println("Withdraw can't be negative.");
            System.out.println("*******************************");
            return 0;
        }
        else{
            return amount;
        }
    }
}