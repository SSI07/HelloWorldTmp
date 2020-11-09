package JavaProgs;

public class Main_bank {
    public static void main(String args[])
    {
        BankAccount acc=new BankAccount();
        acc.setAcc_no(12345678);
        acc.setBalance(2000);
        acc.setName("sheik");
        acc.setPhone(987654321);
        acc.setEmail("a@gmail.com");
        acc.withdraw(100);
        System.out.println("Your balance is "+String.format("%.2f",acc.getBalance()));
    }

}
