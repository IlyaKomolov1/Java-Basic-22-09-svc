package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class HomeWork5 {
    public static void main(String[] args) {
        Client client1 = new Client("Илья", 28);
        Client client2 = new Client("Никита", 33);

        Account account1 = new Account(54, 1);
        Account account2 = new Account(62, 2);

        Bank bank = new Bank();

        List<Account>client1Accounts = new ArrayList<>();
        client1Accounts.add(account1);

        List<Account>client2Accounts = new ArrayList<>();
        client2Accounts .add(account2);

        bank.map.put(client1,client1Accounts);
        bank.map.put(client2,client2Accounts);

        Client searchClient = new Client("Илья",28);
        List<Account> accounts = bank.getAccounts(searchClient);
        System.out.println(accounts);

        bank.accountClientMap.put(account1,client1);
        bank.accountClientMap.put(account2,client2);

        Account searchAccount = new Account(54,1);
        Client client = bank.findClient(searchAccount);
        System.out.println(client);
    }
}