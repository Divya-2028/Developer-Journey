package polymorphism;
import java.util.Scanner;
class Payment {
    private int amount;
    private String transactionId;
    Payment(int amount , String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }
    public void processPayment() {
        System.out.println("Processing payment...");
    }
    public void printReceipt() {
        System.out.println("\n========== PAYMENT RECEIPT ==========");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount         : ₹" + amount);
    }
}
class CreditCardPayment extends Payment{
    private String cardHolderName;
    private String cardNumber;
    CreditCardPayment(int amount , String transactionId , String cardHolderName , String cardNumber){
        super(amount , transactionId);
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment() {
        System.out.println("Validating credit card...");
        super.processPayment();
        System.out.println("Payment successful using Credit Card.");
    }
    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("Payment Method : Credit Card");
        System.out.println("Status         : Success");
        System.out.println("Thank you for your payment.");
        System.out.println("=====================================\n");
    }
}
class UpiPayment extends Payment{
    private String upiId;
    UpiPayment(int amount , String  transactionId ,String upiId){
        super(amount , transactionId);
        this.upiId = upiId;
    }
    @Override
    public void processPayment() {
        System.out.println("Connecting to UPI server...");
        super.processPayment();
        System.out.println("Payment successful using UPI.");
    }
    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("Payment Method : UPI");
        System.out.println("Status         : Success");
        System.out.println("Thank you for your payment.");
        System.out.println("=====================================\n");
    }
}
class PayPalPayment extends Payment{
    private String email;
    PayPalPayment(int amount , String  transactionId , String email){
        super(amount , transactionId);
        this.email = email;
    }
    @Override
    public void processPayment() {
        System.out.println("Logging into PayPal...");
        super.processPayment();
        System.out.println("Payment successful using PayPal.");
    }
    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("Payment Method : PayPal");
        System.out.println("Status         : Success");
        System.out.println("Thank you for your payment.");
        System.out.println("=====================================\n");
    }
}
class CashOnDelivery extends Payment{
    CashOnDelivery(int amount , String  transactionId) {
        super(amount , transactionId);
    }

    @Override
    public void processPayment() {
        System.out.println("Order placed successfully.");
        System.out.println("Payment will be collected upon delivery.");
    }
    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("Payment Method : Cash On Delivery");
        System.out.println("Status         : Pending Payment");
        System.out.println("Please pay when the product arrives.");
        System.out.println("=====================================\n");
    }
}
public class OnlinePaymentProcessingSystem {
    public static void showMenu() {
        Payment payment;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========== Payment Menu =========");
            System.out.println("1. Credit Card");
            System.out.println("2. UPI");
            System.out.println("3. PayPal");
            System.out.println("4. Cash On Delivery");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Amount: ");
                    int amount1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Transaction ID: ");
                    String transactionId1 = sc.nextLine();
                    System.out.print("Enter Card Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Card Number: ");
                    String cardNumber = sc.nextLine();
                    if (amount1 <= 0) {
                        System.out.println("Amount must be greater than zero.");
                        break;
                    }
                    if (transactionId1.isBlank()) {
                        System.out.println("Transaction ID cannot be empty.");
                        break;
                    }
                    if (name.isBlank()) {
                        System.out.println("Card Holder Name cannot be empty.");
                        break;
                    }
                    if (!cardNumber.matches("\\d{16}")) {
                        System.out.println("Card Number must contain exactly 16 digits.");
                        break;
                    }
                    payment = new CreditCardPayment(amount1, transactionId1, name, cardNumber);
                    payment.processPayment();
                    payment.printReceipt();
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    int amount2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Transaction ID: ");
                    String transactionId2 = sc.nextLine();
                    System.out.print("Enter Upi ID: ");
                    String upiId = sc.nextLine();
                    if (amount2 <= 0) {
                        System.out.println("Amount must be greater than zero.");
                        break;
                    }
                    if (transactionId2.isBlank()) {
                        System.out.println("Transaction ID cannot be empty.");
                        break;
                    }
                    if (upiId.isBlank()) {
                        System.out.println("UPI ID cannot be empty.");
                        break;
                    }
                    payment=new UpiPayment(amount2, transactionId2, upiId);
                    payment.processPayment();
                    payment.printReceipt();
                    break;
                case 3:
                    System.out.print("Enter Amount: ");
                    int amount3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Transaction ID: ");
                    String transactionId3 = sc.nextLine();
                    System.out.print("Enter PayPal Email: ");
                    String email = sc.nextLine();
                    if (amount3 <= 0) {
                        System.out.println("Amount must be greater than zero.");
                        break;
                    }
                    if (transactionId3.isBlank()) {
                        System.out.println("Transaction ID cannot be empty.");
                        break;
                    }
                    if (email.isBlank() || !email.contains("@")) {
                        System.out.println("Invalid Email.");
                        break;
                    }
                    payment = new PayPalPayment(amount3, transactionId3, email);
                    payment.processPayment();
                    payment.printReceipt();
                    break;
                case 4:
                    System.out.print("Enter Amount: ");
                    int amount4 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Transaction ID: ");
                    String transactionId4 = sc.nextLine();
                    if (amount4 <= 0) {
                        System.out.println("Amount must be greater than zero.");
                        break;
                    }
                    if (transactionId4.isBlank()) {
                        System.out.println("Transaction ID cannot be empty.");
                        break;
                    }
                    payment=new CashOnDelivery(amount4,transactionId4);
                    payment.processPayment();
                    payment.printReceipt();
                    break;
                case 5:
                    System.out.println("Thank you for using the Payment System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }
    public static void main(String[] args) {
        showMenu();
    }
}