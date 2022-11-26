package HomeWork5;

import java.util.List;

public class HomeWork5 {
    public static void main(String[] args) {
        Client client1 = new Client("Илья", 28);
        Client client2 = new Client("Никита", 33);
        Account account1 = new Account(38, 1);
        Account account2 = new Account(65, 2);
        Bank bank = new Bank();
        bank.clients.add(client1);
        bank.clients.add(client2);
        bank.accounts.add(account1);
        bank.accounts.add(account2);
        client1.addAccount(account1);
        client1.addAccount(account2);
        Client userClient = new Client("Илья", 28);
        List<Account> accounts = bank.getAccounts(userClient);
        System.out.println(accounts);

    }
}