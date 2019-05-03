import java.time.LocalDate;

abstract class AccountOperation {

    private LocalDate date;
    Money amount;

    AccountOperation(Money amount) {
        this.date = LocalDate.now();
        this.amount = amount;
    }

   abstract Money calculateBalance(Money balance);

    @Override
    public String toString() {
        return "AccountOperation : " +
                "date = " + date +
                 ", amount = " + amount;
    }
}
