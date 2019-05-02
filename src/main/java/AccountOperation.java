import java.time.LocalDate;

abstract class AccountOperation {

    private LocalDate date;
    private  double amount;

    AccountOperation(double amount) {
        this.date = LocalDate.now();
        this.amount = amount;
    }

    double calculateBalance(double balance){
            return balance + amount;
    }

    @Override
    public String toString() {
        return "AccountOperation : " +
                "date = " + date +
                 ", amount = " + amount;
    }
}
