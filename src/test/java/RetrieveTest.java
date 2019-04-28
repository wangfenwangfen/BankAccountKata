import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RetrieveTest {

    @Test
    public void balance_should_not_change_if_retrieve_amount_is_zero() {

        Account account = new Account(50);

        AccountOperation retrieve = new AccountOperation(0, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 50;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_if_retrieve_amount_is_greater_than_zero() {

        Account account = new Account(150);
        AccountOperation retrieve = new AccountOperation(50, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 100;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }
}
