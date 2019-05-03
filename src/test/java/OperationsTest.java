import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationsTest {
    @Test
    public void balance_should_increase_with_many_deposits_bigger_than_zero() {
        AccountOperation deposit1 = new Deposit(Money.valueOf(800));
        AccountOperation deposit2 = new Deposit(Money.valueOf(100));
        Account account = new Account();
        account.addOperation(deposit1);

        Money balanceAfterOperation = account.addOperation(deposit2);

        double balanceExpected = 900
                ;
        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_when_many_retrieves_amount_are_greater_than_zero() {
        AccountOperation retrieve1 = new Retrieve(Money.valueOf(50));
        AccountOperation retrieve2 = new Retrieve(Money.valueOf(100));
        Account account = new Account();

        account.addOperation(retrieve1);

        Money balanceAfterOperation = account.addOperation(retrieve2);

        double balanceExpected = -150;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void operations_with_deposit_and_retrieve(){
        AccountOperation deposit1 = new Deposit(Money.valueOf(100));
        AccountOperation deposit2 = new Deposit(Money.valueOf(20));
        AccountOperation retrieve = new Retrieve(Money.valueOf(50));

        Account account = new Account();

        account.addOperation(deposit1);
        account.addOperation(deposit2);
        Money balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 70;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);

    }

    @Test
    public void should_return_list_of_operations_history_with_balance_detail() {
        Account account = new Account();
        Money amount =Money.valueOf ( 100);
        Money amount2 =  Money.valueOf(200);
        AccountOperation deposit = new Deposit(amount);
        AccountOperation deposit2 = new Deposit(amount2);

        account.addOperation(deposit);
        account.addOperation(deposit2);
        List<String> operationSWithBalances = account.generateOperationHistoryWithBalance();

        String depositString = deposit.toString() + " balance = "+ 100d + "\n" ;
        String deposit2String = deposit2.toString() + " balance = "+ 300d + "\n" ;
        List<String> stringExpected = new ArrayList<>();
        stringExpected.add(depositString);
        stringExpected.add(deposit2String);

        assertThat(operationSWithBalances).isEqualTo(stringExpected);
    }
}
