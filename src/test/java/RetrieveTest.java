import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RetrieveTest {

    @Test
    public void balance_should_not_change_if_retrieve_amount_is_zero() {

        Account account = new Account(50);
        double amount = 0;

        double balanceAfterRetrieve = account.retrieve(amount);

        double balanceExpected = 50;

        assertThat(balanceAfterRetrieve).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_if_retrieve_amount_is_greater_than_zero() {

        Account account = new Account(150);
        double amount = 50;

        double balanceAfterRetrieve = account.retrieve(amount);

        double balanceExpected = 100;

        assertThat(balanceAfterRetrieve).isEqualTo(balanceExpected);
    }
}
