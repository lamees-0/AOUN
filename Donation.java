public class Donation {
    private Property property;
    private String charityName;
    private String charityAddress;


    public Donation(Property property, String charityName, String charityAddress) {
        this.property = property;
        this.charityName = charityName;
        this.charityAddress = charityAddress;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }

    public String getCharityAddress() {
        return charityAddress;
    }

    public void setCharityAddress(String charityAddress) {
        this.charityAddress = charityAddress;
    }

    @Override
    public String toString() {
        return String.format("..................\nThe Property:\n%s\n..................\nCharity:\n" +
                "%s\n%s\n..................\nDonation completed successfully ...\n",getProperty().toString(),getCharityName(),getCharityAddress());
    }
}
