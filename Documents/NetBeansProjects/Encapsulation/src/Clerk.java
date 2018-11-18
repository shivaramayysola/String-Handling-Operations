public class Clerk {
    public static void main(String[] args)
    {
            BankAccount acc1 = new BankAccount();
            acc1.setBalance(5000);
            System.out.println(acc1.getBalance());
            acc1.setBalance(-5000);
            System.out.println(acc1.getBalance());

    }
}
