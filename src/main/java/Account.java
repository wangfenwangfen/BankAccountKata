import java.util.List;

class Account {
    private double balance;
    private List<AccountOperation> operations;

    Account(double balance, List<AccountOperation> operations) {
        this.balance = balance;
        this.operations = operations;
    }

    double addOperation(AccountOperation accountOperation) {
        balance = accountOperation.doOperation(balance);
        operations.add(accountOperation);
        return balance;
    }
}
