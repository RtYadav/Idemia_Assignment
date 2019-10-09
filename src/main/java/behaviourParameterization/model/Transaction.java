package behaviourParameterization.model;

public class Transaction {
    public Transaction(String transactionType, Integer amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    private String transactionType;
    private Integer amount;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
