public class Recycle {
    private Property property;
    private String factoryName;
    private String factoryAddress;


    public Recycle(Property property, String factoryName, String factoryAddress) {
        this.property = property;
        this.factoryName = factoryName;
        this.factoryAddress = factoryAddress;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    @Override
    public String toString() {

        return String.format("..................\nThe Property:\n%s\n..................\nFactory:\n" +
                "%s\n%s\n..................\nA request for recycling has been sent ...\n",getProperty().toString(),getFactoryName(),getFactoryAddress());
    }
}
