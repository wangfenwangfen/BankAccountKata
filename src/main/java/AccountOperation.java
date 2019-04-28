import java.time.LocalDateTime;

abstract class AccountOperation {

    private LocalDateTime dateTime;
    private  double amount;

    AccountOperation(double amount) {
        this.dateTime = LocalDateTime.now();
        this.amount = amount;
    }

    double doOperation(double balance){
            return balance + amount;
    }

    @Override
    public String toString() {
        return "AccountOperation : " +
                "dateTime = " + dateTime +
                 ", amount = " + amount + "\n";
    }
}
