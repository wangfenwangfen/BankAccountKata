import java.util.ArrayList;
import java.util.List;

class Account {
    private double balance;
    private List<AccountOperation> operations;

    Account(double balance, List<AccountOperation> operations) {
        this.balance = balance;
        this.operations = operations;
    }

    Account() {
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    double addOperation(AccountOperation accountOperation) {
        balance = accountOperation.doOperation(balance);
        operations.add(accountOperation);
        return balance;
    }
}
