public class Bank {
    public static void main(String[] args) {
    BankAcount holder1 = new BankAcount();
    holder1.holdername = "Divyansh Sharma";
    holder1.balance  = 10000;
    holder1.accnumber = 1003005320076L;
    System.out.print("Account Holder Name: "+ holder1.holdername +
            "\nInitial Balance: " + holder1.balance +
            "\nAccount Number: "+ holder1.accnumber + "\n\n");
    holder1.deposit(3000);
    holder1.withdraw(15000);
    holder1.withdraw(7500);
    System.out.print(holder1.checkBalance());
    }}
class BankAcount{
    String holdername;
    double balance;
    long accnumber;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("deposited " + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdrawn " + amount);
        } else {
            System.out.println("Not enough balance");
        }}
    public String checkBalance() {
            return "Available Balance: " + balance;
        }
    }
