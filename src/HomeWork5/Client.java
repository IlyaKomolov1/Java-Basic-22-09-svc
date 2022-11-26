package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    int age;
    List<Account>accounts = new ArrayList<Account>();
    public void addAccount(Account account){
        accounts.add(account);
    }
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
