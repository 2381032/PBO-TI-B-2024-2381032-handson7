package enkapsulasi;

public class main {
    public static void main(String[] args) {
        BankAccount yecoefSitumorang = new BankAccount(100);
        yecoefSitumorang.withdraw(10);
        System.out.println(yecoefSitumorang.getSaldo());
    }
}
