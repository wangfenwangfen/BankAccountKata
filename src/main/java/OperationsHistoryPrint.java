import java.util.List;

public class OperationsHistoryPrint {

    public static void main(String[] args) {

        Account account = new Account();
        AccountOperation deposit1 = new Deposit(Money.valueOf(1000));
        AccountOperation deposit2 = new Deposit(Money.valueOf(20));
        AccountOperation retrieve1 = new Retrieve(Money.valueOf(50));
        AccountOperation retrieve2 = new Retrieve(Money.valueOf(100));

        account.addOperation(deposit1);
        account.addOperation(deposit2);
        account.addOperation(retrieve1);
        account.addOperation(retrieve2);

        List<String> operationsHistory = account.generateOperationHistoryWithBalance();

        System.out.println(operationsHistory);

    }
}
