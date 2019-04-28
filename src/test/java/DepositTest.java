import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DepositTest {

    @Test
    public void balance_should_not_change_if_deposit_amount_is_zero() {
        Account account = new Account();
        AccountOperation deposit = new AccountOperation(0, "+");

        double balanceAfterOperation = account.addOperation(deposit);

        double balanceExpected = 0;

        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void  balance_should_increase_if_deposit_amount_is_greater_than_zero() {
        Account account = new Account();
        AccountOperation deposit = new AccountOperation(50, "+");

        double balanceAfterOperation = account.addOperation(deposit);

        double balanceExpected = 50
                ;
        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }


}
