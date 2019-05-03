class Deposit extends AccountOperation {
    Deposit(Money amount) {
        super(amount);
    }
    @Override
    Money calculateBalance(Money balance) {
        return balance.addBy(amount);
    }
}
