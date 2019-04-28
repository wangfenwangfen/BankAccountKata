import java.time.LocalDateTime;

class AccountOperation {

    private LocalDateTime dateTime;
    private  double amount;
    private  String type;

    AccountOperation(double amount, String type) {
        this.dateTime = LocalDateTime.now();
        this.amount = amount;
        this.type = type;
    }

    double doOperation(double balance){
        if(this.type.equals("+")) {
            return balance + amount;
        }
        return balance - amount;
    }

    @Override
    public String toString() {
        return "AccountOperation : " +
                "dateTime = " + dateTime +
                 ", amount = " + type + amount + "\n";
    }
}
