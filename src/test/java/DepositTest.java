import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DepositTest {

    @Test
    public void balance_should_not_change_if_deposit_amount_is_zero() {
        double amount = 0;
        Account account = new Account(50);

        double balanceAfterOperation = account.deposit(amount);

        double balanceExpected = 50;

        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void  balance_should_increase_if_deposit_amount_is_greater_than_zero() {
        double amount = 50;
        Account account = new Account(50);

        double balanceAfterOperation = account.deposit(amount);
        
        double balanceExpected = 100
                ;
        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }
}
