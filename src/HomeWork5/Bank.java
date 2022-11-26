package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Client> clients = new ArrayList<Client>();
    List<Account> accounts = new ArrayList<Account>();

    List<Account> getAccounts(Client client) {
        for (Client s : clients) {
            if (client.name.equals(s.name) && client.age == s.age) {
                return s.accounts;
            }
        }
        return null;
    }

    Client findClient(Account account) {
        return null;
    }
}