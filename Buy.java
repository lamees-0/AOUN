public class Buy {
    private Property property;
    private boolean cashPayment = false;
    private boolean creditCardPayment = false;

    private String cardNumber;
    private String cardName;
    private String cardDate;
    private String cvv;


    public Buy(Property property) {
        this.property = property;
        this.cashPayment = true;
    }

    public Buy(Property property, String cardNumber, String cardName, String cardDate, String cvv) {
        this.property = property;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardDate = cardDate;
        this.cvv = cvv;
        creditCardPayment = true;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        String string = "";
        if (cashPayment) {
            string= String.format("..........\n" +
                    "Purchase details:\nThe Property:\n%s\n..................\n" +
                    "payment method:\n" +
                    "Cash\n" +
                    "Order placed successfully\n", getProperty());
        } else if (creditCardPayment) {
            string= String.format("..........\n" +
                    "Purchase details:\nThe Property:\n%s\n..................\n" +
                    "payment method:\n" +
                    "Credit Card\n" +
                    "Card Number: %s\n" +
                    "Card Name: %s\n" +
                    "Card Expiry Date: %s\n" +
                    "CVV: %s\n" +
                    "Order placed successfully\n", getProperty(), getCardNumber(), getCardName(), getCardDate(), getCvv());
        }

        return string;
    }
}