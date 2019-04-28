import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RetrieveTest {

    @Test
    public void balance_should_not_change_if_retrieve_amount_is_zero() {
        Account account = new Account();

        AccountOperation retrieve = new AccountOperation(0, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = 0;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_if_retrieve_amount_is_greater_than_zero() {
        Account account = new Account();
        AccountOperation retrieve = new AccountOperation(50, "-");

        double balanceAfterOperation = account.addOperation(retrieve);

        double balanceExpected = -50;

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }


}
