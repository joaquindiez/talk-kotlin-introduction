package j10.stt.demo;

public class MoneyJava {

    private int amount;
    private String currency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoneyJava)) return false;

        MoneyJava moneyJava = (MoneyJava) o;

        if (getAmount() != moneyJava.getAmount()) return false;
        return getCurrency().equals(moneyJava.getCurrency());
    }

    @Override
    public int hashCode() {
        int result = getAmount();
        result = 31 * result + getCurrency().hashCode();
        return result;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
