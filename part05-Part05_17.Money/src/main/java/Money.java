
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros() + this.euros, addition.cents() + this.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros() || this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        } else {
            return false;
        }

    }

    public Money minus(Money decreaser) {
        Money minusMoney = new Money(this.euros, this.cents);
        if (minusMoney.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            int euroDiff = euros - decreaser.euros();
            int centDiff = cents - decreaser.cents();
            int totalDiffInCents = euroDiff * 100 + centDiff;

            
                int eurosRtn = totalDiffInCents / 100;
                int centRtn = totalDiffInCents % 100;
                return new Money(eurosRtn, centRtn);
            }
            
            
        }
    }


