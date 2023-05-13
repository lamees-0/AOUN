public class User {
    private String username;
    private String password;
    private String email;
    private int points;

    public User() {
    }

    public User(String username, String password, String email, int points) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.points = points;
    }

    public void donate(Property property, String charityName, String charityAddress){
        Donation donation = new Donation(property,charityName,charityAddress);
        System.out.println(donation.toString());
    }
    public void sell(Property property){
        Sell sell = new Sell(property,true);
        System.out.println(sell.toString());
    }
    public void sell(Property property,int accountNumber){
        Sell sell = new Sell(property,accountNumber);
        System.out.println(sell.toString());

    }
    public void recycle(Property property,String factoryName, String factoryAddress){
        Recycle recycle = new Recycle(property,factoryName,factoryAddress);
        System.out.println(recycle.toString());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
