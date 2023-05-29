import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static ArrayList<Property>  properties= new ArrayList<>();
    private static ArrayList<Buy>  propertiesSold= new ArrayList<>();

    public static void main(String[] args) {
        runApp(new User("username","password","email",0));
    }

    public static void runApp(User user){
        input.useDelimiter("\n");
        boolean isActive = true;
        while (isActive){
            System.out.printf("1- Sell Property\n" +
                    "2- Donate Property\n" +
                    "3- Recycle Property\n" +
                    "4- Buy Property\n" +
                    "5- Exit\n" +
                    "choice:");
            int choice= input.nextInt();
            switch(choice){
                case 1:
                    Property property = addProperty(user);
                    properties.add(property);
                    break;
                case 2:
                    property = addProperty(user);
                    System.out.print("Enter charity name:");
                    String charityName = input.next();
                    System.out.print("Enter charity address:");
                    String charityAddress = input.next();
                    user.donate(property,charityName,charityAddress);
                    break;
                case 3:
                    property = addProperty(user);
                    System.out.print("Enter factory name:");
                    String factoryName = input.next();
                    System.out.print("Enter factory address:");
                    String factoryAddress = input.next();
                    user.recycle(property,factoryName,factoryAddress);
                    break;
                case 4:
                    displayProperty();
                    System.out.print("Select Property:");
                    int index = input.nextInt();
                    Property _property = properties.get(index-1);
                    if (_property.isSold()){
                        System.out.println("this is sold");
                    }else{
                        System.out.print("Enter Payment Method:\n" +
                                "1- Online Payment\n2- When Receiving\n" +
                                "select:");
                        int select = input.nextInt();
                        if (select != 1 && select != 2){
                            select = 1;
                        }
                        switch (select){
                            case 1:
                                System.out.print("Card name:");
                                String cardName = input.next();
                                System.out.print("Card number:");
                                String cardNumber = input.next();
                                System.out.print("Date:");
                                String cardDate = input.next();
                                System.out.print("Cvv:");
                                String cvv = input.next();
                                Buy buy = new Buy(_property,cardNumber,cardName,cardDate,cvv);
                                propertiesSold.add(buy);
                                _property.setSold(true);
                                System.out.println(buy.toString());
                                properties.get(index-1).setSold(true);
                                break;
                            case 2:
                                buy = new Buy(_property);
                                propertiesSold.add(buy);
                                _property.setSold(true);
                                System.out.println(buy.toString());
                                properties.get(index-1).setSold(true);
                                break;
                            default:
                                System.out.println("Error Entry");
                                break;
                        }
                    }

                    break;
                case 5:
                    isActive = false;
                    System.out.println("Good bey ... ");
                    break;
                default:System.out.println("Error Entry try again ...");

            }
        }

    }

    private static Property addProperty(User owner){
        input.useDelimiter("\n");
        System.out.println("Add your property :");
        System.out.print("Enter Property name:");
        String name = input.next();
        System.out.print("Enter Property type:");
        String type = input.next();
        System.out.print("Enter Property price:");
        double price = input.nextDouble();
        System.out.print("Enter Property description:");
        String description = input.next();
        return new Property(name,type,description,price,owner);
    }

    private static void displayProperty(){
        System.out.println("-----------------------------------");
        for (int i = 0;i<properties.size();i++){
            System.out.println((i+1)+"_ "+properties.get(i).toString());
            System.out.println("-----------------------------------");
        }
    }

    private static Property getProperty(int index){
        Property property = properties.get(index);
        return property;
    }


}