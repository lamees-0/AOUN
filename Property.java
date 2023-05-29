public class Property {
    private String name;
    private String type;
    private String description;
    private double price;
    private boolean isSold;
    private User owner;

    public Property() {
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public Property(String name, String type, String description, double price, User owner) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.owner = owner;
        isSold = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String Sold = isSold?"Sold":"Not Sold";
        return String.format("name: %s     type: %s     price: %s\n" +
                "Description:%s\n" +
                "owner:%s   %s",getName(),getType(),getPrice(),getDescription(),getOwner().getUsername(),Sold);
    }
}
