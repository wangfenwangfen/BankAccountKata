class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

   double deposit(double amount) {
        return this.balance + amount;
    }

    double retrieve(double amount) {
        return this.balance;
    }
}
