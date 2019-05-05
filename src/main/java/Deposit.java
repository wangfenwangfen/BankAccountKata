class Deposit extends AccountOperation {
    Deposit(Money amount) {
        super(amount);
    }
    @Override
    Money calculateBalance(Money balance) {
        return balance.addBy(amount);
    }

    @Override
    public String toString() {
        return "AccountOperation : " +
                "date = " + date +
                ", amount = +" + amount;
    }
}
