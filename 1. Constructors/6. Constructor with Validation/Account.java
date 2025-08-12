/*Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

a)accountNumber should be non-null and non-empty.
b)balance should be non-negative.
c)Print an error message if the validation fails.*/

public class Account
{
    String accountNumber;
    float balance;

    public Account(String accountNumber, float balance)
    {
        // Validate account number
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Invalid";
        }

        // Validate balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0.0f;
        }
    }

    public void getAccount()
    {
        System.out.println("Account Number = " + accountNumber + ", Balance = " + balance);
    }

    public static void main(String[] args)
    {
        // Valid account
        Account a1 = new Account("ACC123", 5000.75f);
        a1.getAccount();

        // Invalid account number
        Account a2 = new Account("", 3000.50f);
        a2.getAccount();

        // Negative balance
        Account a3 = new Account("ACC789", -1500.00f);
        a3.getAccount();
    }
}

/*
OUTPUT:
Account Number = ACC123, Balance = 5000.75
Error: Account number cannot be null or empty.
Account Number = Invalid, Balance = 3000.5
Error: Balance cannot be negative.
Account Number = ACC789, Balance = 0.0
*/