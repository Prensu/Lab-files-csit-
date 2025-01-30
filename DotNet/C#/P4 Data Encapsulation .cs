using System;

class BankAccount
{
    private double balance; // Private variable (Data Hiding)

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    // Public method to deposit money
    public void Deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            Console.WriteLine($"Deposited: {amount}");
        }
        else
        {
            Console.WriteLine("Invalid deposit amount");
        }
    }

    // Public method to withdraw money
    public void Withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            Console.WriteLine($"Withdrawn: {amount}");
        }
        else
        {
            Console.WriteLine("Invalid withdrawal amount");
        }
    }

    // Getter method to access balance
    public double GetBalance()
    {
        return balance;
    }
}

// Usage
class Program
{
    static void Main()
    {
        BankAccount account = new BankAccount(1000); // Initial balance
        account.Deposit(500);
        account.Withdraw(300);
        Console.WriteLine("Balance: " + account.GetBalance());

        // Attempting to access private variable directly (Not Allowed)
        // Console.WriteLine(account.balance); // Compilation Error
    }
}
