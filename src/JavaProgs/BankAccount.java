package JavaProgs;

public class BankAccount {
    private  int acc_no;
    private String name;
    private String email;
    private double balance;
    private long phone;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public double deposit(double amt){
        if(amt>0)
            balance+=amt;
            return balance;

    }
    public double withdraw(double amt){
        if(amt<balance)
            balance-=amt;
            return balance;
    }
}
