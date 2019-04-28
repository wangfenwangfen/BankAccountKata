import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationsTest {
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
