import java.util.List;

public class OperationsHistory {
    private static   Account account;

    public static void main(String[] args) {

        account = new Account();
        AccountOperation deposit1 = new Deposit(1000);
        AccountOperation deposit2 = new Deposit(20);
        AccountOperation retrieve1 = new Retrieve(50);
        AccountOperation retrieve2 = new Retrieve(100);

        account.addOperation(deposit1);
        account.addOperation(deposit2);
        account.addOperation(retrieve1);
        account.addOperation(retrieve2);

        List<String> operationsHistory = account.generateOperationHistoryWithBalance();

        System.out.println(operationsHistory);

    }
}
