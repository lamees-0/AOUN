public class Sell {
    private Property property;
    private boolean onlinePayment = true;
    private boolean whenReceiving = false;

    private int accountNumber;


    public Sell() {
    }

    public Sell(Property property,int accountNumber) {
        this.property = property;
        this.accountNumber = accountNumber;

    }
    public Sell(Property property, boolean whenReceiving) {
        this.property = property;
        if (whenReceiving){
            this.onlinePayment = false;
            this.whenReceiving = whenReceiving;
        }

    }


    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        if (onlinePayment){
            return String.format(".........." +
                    "Sale details:\nThe Property:\n%s\n..................\npayment:\n" +
                    "online Payment\n" +
                    "Bank Account: %s\n",getProperty(),getAccountNumber());
        }else{
            return String.format(".........." +
                    "Sale details:\nThe Property:\n%s\n..................\npayment:\n" +
                    "Payment when receiving",getProperty().toString());
        }

    }
}
