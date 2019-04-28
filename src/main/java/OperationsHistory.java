import java.util.ArrayList;
import java.util.List;

public class OperationsHistory {
    private static   Account account;

    public static void main(String[] args) {
        List<AccountOperation> operations = new ArrayList<>();

        account = new Account(100,operations);
        AccountOperation deposit1 = new Deposit(1000);
        AccountOperation deposit2 = new Deposit(20);
        AccountOperation retrieve1 = new Retrieve(50);
        AccountOperation retrieve2 = new Retrieve(100);

        List<String> operationsHistory = new ArrayList<>();
        operationWithBalance(deposit1, operationsHistory);
        operationWithBalance(deposit2, operationsHistory);
        operationWithBalance(retrieve1, operationsHistory);
        operationWithBalance(retrieve1, operationsHistory);
        operationWithBalance(retrieve2, operationsHistory);

        System.out.println(operationsHistory);

    }

    private static List<String> operationWithBalance(AccountOperation operation, List<String> operationsHistory){
        String operationWithBalance= operation.toString() + "balance = " + account.addOperation(operation);
        operationsHistory.add(operationWithBalance);

        return operationsHistory;
    }
}
