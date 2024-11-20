public class LoanOffer {
    private double amount;
    private double intrestrate;
    private String bank;

    LoanOffer(String bank, double amount, double intrestrate){
        this.bank = bank;
        this.amount= amount;
        this.intrestrate = intrestrate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getIntrestrate() {
        return intrestrate;
    }

    public void setIntrestrate(double intrestrate) {
        this.intrestrate = intrestrate;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "LoanOffer{" +
                "amount=" + amount +
                ", intrestrate=" + intrestrate +
                ", bank='" + bank + '\'' +
                '}';
    }
}
