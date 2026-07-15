package encapsulation;
import java.util.Scanner;
class ATM{
    private final BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========ATM=========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (account.verifyPin(sc)) {
                        account.checkBalance();
                    }
                    break;
                case 2:
                    if (account.verifyPin(sc)) {
                        account.deposit(sc);
                    }
                    break;
                case 3:
                    if (account.verifyPin(sc)) {
                        account.withdraw(sc);
                    }
                    break;
                case 4:
                        account.changePin(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }
}
class BankAccount{
    private int balance;
    private int pin = 2024;
    public boolean verifyPin(Scanner sc) {
        System.out.print("Enter your Pin: ");
        int code = sc.nextInt();
        if (pin == code) {
            return true;
        } else {
            System.out.println("Error: Invalid Pin");
            return false;
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance: " + balance);

    }
    public void deposit(Scanner sc) {
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited: " + amount);
            System.out.println("Current Balance: "+ balance);
        } else {
            System.out.println("Error: Invalid Amount");
        }
    }
    public void withdraw(Scanner sc){
        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount<=balance) {
            balance -= amount;
            System.out.println("Successfully Withdrew: " + amount);
            System.out.println("Current Balance: " + balance);
        }
        else if(amount <= 0){
            System.out.println("Amount must be greater than zero.");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance.");
        }
        else {
            System.out.println("Error: Invalid Amount");
        }
    }
    public void changePin(Scanner sc){
        System.out.print("Enter your four digit old pin: ");
        int oldPin = sc.nextInt();
        if(pin == oldPin) {
            System.out.print("Enter your four digit new pin: ");
            int newPin = sc.nextInt();
            if(newPin > 999 && newPin <= 9999){
                pin = newPin;
                System.out.println("PIN changed successfully.");
            }
            else{
                System.out.println("PIN must be exactly 4 digits.");
            }
        }
        else {
            System.out.println("Error: Invalid PIN");
        }
    }
}
public class ATMManagementSystem {
     public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ATM atm = new ATM(account);
        atm.showMenu();
    }
}

