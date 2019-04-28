class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double addOperation(AccountOperation accountOperation) {
        balance = accountOperation.doOperation(balance);
        return balance;
    }
}
