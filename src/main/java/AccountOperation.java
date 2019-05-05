import java.time.LocalDate;

abstract class AccountOperation {

    LocalDate date;
    Money amount;

    AccountOperation(Money amount) {
        this.date = LocalDate.now();
        this.amount = amount;
    }

   abstract Money calculateBalance(Money balance);

    abstract public String toString();
}
