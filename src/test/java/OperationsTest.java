import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationsTest {
    @Test
    public void balance_should_increase_with_many_deposits_bigger_than_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        AccountOperation deposit1 = new AccountOperation(800, "+");
        AccountOperation deposit2 = new AccountOperation(100, "+");
        Account account = new Account(50, operations);
        account.addOperation(deposit1);

        double balanceAfterOperation = account.addOperation(deposit2);

        double balanceExpected = 950
                ;
        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_when_many_retrieves_amount_are_greater_than_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        AccountOperation retrieve1 = new AccountOperation(50,"-");
        AccountOperation retrieve2 = new AccountOperation(100,"-");
        Account account = new Account( 200,operations);

        account.addOperation(retrieve1);

        double balanceAfterOperation = account.addOperation(retrieve2);

        double balanceExpected = 50;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void operations_with_deposit_and_retrieve(){
        List<AccountOperation> operations = new ArrayList<>();
        AccountOperation deposit1 = new AccountOperation(100,"+");
        AccountOperation deposit2 = new AccountOperation(20,"+");
        AccountOperation retrieve = new AccountOperation(50,"-");

        Account account = new Account( 200,operations);

        account.addOperation(deposit1);
        account.addOperation(deposit2);
        account.addOperation(retrieve);
        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 220;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);

    }
}
