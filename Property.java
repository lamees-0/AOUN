public class Property {
    private String name;
    private String type;
    private String description;
    private User owner;

    public Property() {
    }

    public Property(String name, String type, String description, User owner) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return String.format("name: %s     type: %s\n" +
                "Description:%s\n" +
                "owner:%s",getName(),getType(),getDescription(),getOwner().getUsername());
    }
}
