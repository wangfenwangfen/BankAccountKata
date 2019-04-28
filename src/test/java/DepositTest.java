import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DepositTest {

    @Test
    public void balance_should_not_change_if_deposit_amount_is_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        Account account = new Account(50,operations);
        AccountOperation deposit = new AccountOperation(0, "+");

        double balanceAfterOperation = account.addOperation(deposit);

        double balanceExpected = 50;

        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

    @Test
    public void  balance_should_increase_if_deposit_amount_is_greater_than_zero() {
        List<AccountOperation> operations = new ArrayList<>();
        Account account = new Account(50,operations);
        AccountOperation deposit = new AccountOperation(50, "+");

        double balanceAfterOperation = account.addOperation(deposit);

        double balanceExpected = 100
                ;
        Assertions.assertThat(balanceAfterOperation).isEqualTo(balanceExpected);
    }

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
}
