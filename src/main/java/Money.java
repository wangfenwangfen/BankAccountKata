import java.util.Objects;

public class Money {
    private double value;

    private Money(double value) {
        this.value = value;
    }

    public static Money valueOf(double value) {

        return new Money(value);
    }


    public Money substractBy(Money amount) {
        if(amount.value<0){
            throw new IllegalArgumentException("Amount should not be negative");
        }
        return Money.valueOf(value - amount.value);
    }

    public Money addBy(Money amount) {
        if(amount.value<0){
            throw new IllegalArgumentException("Amount should not be negative");
        }
        return Money.valueOf(value + amount.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
