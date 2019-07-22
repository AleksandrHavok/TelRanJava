public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount(123,"Vasya",100);
        BankAccount acc2=new BankAccount(321,"Perya");
        BankAccount acc3=new BankAccount(4124,200_000_000);
        BankAccount acc4=new BankAccount(555);

        acc1.display();
        acc2.display();
        acc3.display();
        acc4.display();

        acc1.addBalance(253);
        acc1.display();
        acc4.takeBalance(200);
        acc4.display();
    }
}
