import org.assertj.core.api.Assertions;
import org.junit.Test;
public class DepositTest {

    @Test
    public void balance_should_not_change_if_deposit_amount_is_zero() {
        Account account = new Account();
        AccountOperation deposit = new Deposit(Money.valueOf(0));

        Money balanceAfterOperation = account.addOperation(deposit);

        Money balanceExpected = Money.valueOf(0);

        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void  balance_should_increase_if_deposit_amount_is_greater_than_zero() {
        Account account = new Account();
        AccountOperation deposit = new Deposit(Money.valueOf(50));

        Money balanceAfterOperation = account.addOperation(deposit);

        Money balanceExpected = Money.valueOf(50);
        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test(expected=IllegalArgumentException.class)
    public void  warn_when_amount_is_less_than_zero() {
        Account account = new Account();
        AccountOperation deposit = new Deposit(Money.valueOf(-50));

        Money balanceAfterOperation = account.addOperation(deposit);

        Money balanceExpected = Money.valueOf(50);
        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }
}
