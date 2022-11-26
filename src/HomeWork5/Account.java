package HomeWork5;

public class Account {
    int amount;
    int id;

    public Account(int amount, int id) {
        this.amount = amount;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", id=" + id +
                '}';
    }
}
