package Repeat;

public class TestBankAccount {
    public static void main(String[] args){
        BankAccount acc1=new BankAccount(123,"Petr",122);
        BankAccount acc2=new BankAccount(235,"Vasiliy");
        BankAccount acc3=new BankAccount(15346,200_000_000);
        BankAccount acc4=new BankAccount(1512);

        acc1.display();
        acc2.display();
        acc3.display();
        acc4.display();

        acc1.addBalance(124);
        acc1.display();
        acc3.takeBalance(125);
        acc3.display();
    }
}
