public class BankAccount {
    private String owner = "Anonimous";
    private int number;
    private double balance;


    public BankAccount(int number, String owner, double balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(int number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public BankAccount(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public BankAccount(int number) {
        this.number = number;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public void addBalance(double sum){
        sum=sum<0?-sum:sum;
        balance+=sum;
    }

    public void takeBalance(double sum){
        sum=sum<0?-sum:sum;
        balance-=sum;
    }

    public void display() {
        System.out.println(number + " " + owner + " " + balance + " NIS");
    }
}
