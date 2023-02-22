import java.util.ArrayList;
import java.util.Scanner;
public class lab4 {
    static int accountNumber;
    static String accountHolderName;
    static double accountBalance;
    static ArrayList<String> transactions = new ArrayList<String>();



    public static void initializeCustomer(int accNum, String accHolderName, double accBalance){
        accountNumber = accNum;
        accountHolderName = accHolderName;
        accountBalance = accBalance;
        transactions.add("Initial Balance: " + accBalance);
        System.out.println("Customer Initialized Successfully!");

    }


    public static void depositMoney(double amount){
        accountBalance += amount;
        transactions.add("Deposit: "+ amount);
        System.out.println("Deposit Successful!");

    }

    public static void withdrawMoney(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            transactions.add("Withdrawal: "+ amount);
            System.out.println("Withdrawal Successful! ");

        } else {
            System.out.println("Insufficient Balance!");

        }
    }


    public static void printTransactions(){
        System.out.println("Transaction History:");
        for(String transaction : transactions) {
            System.out.println(transaction);
        }   
     }

    public static void printAccountSummary(){
        System.out.println("Account Summary:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);

    }


    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        initializeCustomer(129838738, "Vinu", 10000);

        int choice = 0;
        double amount = 0;


        do{
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Print Transactions");
            System.out.println("4. Print Account Summary");
            System.out.println("0. Exit");


            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice){
                case 1:
                System.out.print("Enter the amount to deposit: ");
                amount = scanner.nextDouble();
                depositMoney(amount);
                break;
                case 2: 
                System.out.print("Enter the amount to withdraw: ");
                amount = scanner.nextDouble();
                withdrawMoney(amount);
                break;
                case 3: 
                printTransactions();
                break;
                case 4:
                printAccountSummary();
                break;
                case 0:
                System.out.println("Exiting the program. . .");
                break;
                default:
                System.out.println("Invalid choice! Please try again.");
                break;

        

            }

        }while (choice !=0);
         scanner.close();


    }



    
}
