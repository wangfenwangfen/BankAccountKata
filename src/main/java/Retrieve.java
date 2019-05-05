class Retrieve extends AccountOperation {
    Retrieve(Money amount) {
        super(amount);
    }

    @Override
    Money calculateBalance(Money balance) {
        return balance.substractBy(amount);
    }

    @Override
    public String toString() {
        return "AccountOperation : " +
                "date = " + date +
                ", amount = -" + amount;
    }
}
