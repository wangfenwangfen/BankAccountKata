class Retrieve extends AccountOperation {
    Retrieve(Money amount) {
        super(amount);
    }

    @Override
    Money calculateBalance(Money balance) {
        return balance.substractBy(amount);
    }
}
