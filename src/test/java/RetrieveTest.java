import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RetrieveTest {

    @Test
    public void balance_should_not_change_if_retrieve_amount_is_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        Account account = new Account(50,operations);

        AccountOperation retrieve = new AccountOperation(0, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 50;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_if_retrieve_amount_is_greater_than_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        Account account = new Account(150,operations);
        AccountOperation retrieve = new AccountOperation(50, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 100;

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
}
