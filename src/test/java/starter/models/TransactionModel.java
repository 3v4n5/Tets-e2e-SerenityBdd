package starter.models;

public class TransactionModel {
    private String transctionDate;
    private String transctionAmount;
    private String transctionDescription;

    public String getTransctionDate() {
        return transctionDate;
    }

    public void setTransctionDate(String transctionDate) {
        this.transctionDate = transctionDate;
    }

    public String getTransctionAmount() {
        return transctionAmount;
    }

    public void setTransctionAmount(String transctionAmount) {
        this.transctionAmount = transctionAmount;
    }

    public String getTransctionDescription() {
        return transctionDescription;
    }

    public void setTransctionDescription(String transctionDescription) {
        this.transctionDescription = transctionDescription;
    }
}
