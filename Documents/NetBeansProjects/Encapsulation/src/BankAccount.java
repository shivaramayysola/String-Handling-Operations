public class BankAccount {
    private double balance;
    public void setBalance(double balance)
   {
        if(balance<=0)
        {
            System.out.println("do not enter negative amount");
        }
        else
        {
                this.balance = balance;
        }
    }
    public double getBalance()
    {
            return balance;
    }
        
}
