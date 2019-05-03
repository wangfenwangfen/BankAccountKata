import java.util.ArrayList;
import java.util.List;

class Account {
    private Money balance;
    private List<AccountOperation> operations;

    Account() {
        this.balance = Money.valueOf(0);
        this.operations = new ArrayList<>();
    }

    Money addOperation(AccountOperation accountOperation) {

        balance = accountOperation.calculateBalance(balance);
        operations.add(accountOperation);
        return balance;
    }

    List<String> generateOperationHistoryWithBalance(){
        List<String> operationsHistoryWithBalances = new ArrayList<>();
        Money balanceHistory = Money.valueOf(0);

        for(AccountOperation operation : operations){

            balanceHistory =  operation.calculateBalance(balanceHistory);

            operationsHistoryWithBalances.add(operation.toString()+ " balance = " + balanceHistory + "\n");

        }

        return operationsHistoryWithBalances;
    }
}
