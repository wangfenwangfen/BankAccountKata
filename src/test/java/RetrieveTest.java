import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RetrieveTest {

    @Test
    public void balance_should_not_change_if_retrieve_amount_is_zero() {
        Account account = new Account();

        AccountOperation retrieve = new Retrieve(Money.valueOf(0));

        Money balanceAfterOperation = account.addOperation(retrieve);

        Money balanceExpected =  Money.valueOf(0);

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void balance_should_decrease_if_retrieve_amount_is_greater_than_zero() {
        Account account = new Account();
        AccountOperation retrieve = new Retrieve(Money.valueOf(50));

        Money balanceAfterOperation = account.addOperation(retrieve);

        Money balanceExpected = Money.valueOf(-50);

        assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }


}
