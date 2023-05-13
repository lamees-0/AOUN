import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        runApp(new User("username","password","email",0));
    }

    public static void runApp(User user){
        boolean isActive = true;
        while (isActive){
            System.out.printf("1- Sell Property\n" +
                    "2- Donate Property\n" +
                    "3- Recycle Property\n" +
                    "4- Exit" +
                    "choice:");
            int choice= input.nextInt();
            switch(choice){
                case 1:
                    Property property = addProperty(user);
                    System.out.print("Enter Payment Method:\n" +
                            "1- Online Payment\n2- When Receiving\n" +
                            "select:");
                    int select = input.nextInt();
                    if (select != 1 && select != 2){
                        select = 1;
                    }
                    switch (select){
                        case 1:
                            System.out.print("Enter your bank account number:");
                            int accountNumber = input.nextInt();
                            user.sell(property,accountNumber);
                            break;
                        case 2:
                            user.sell(property);
                            break;
                        default:
                            System.out.println("Error Entry");
                            break;
                    }
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
                    isActive = false;
                    System.out.println("Good bey ... ");
                    break;
                default:System.out.println("Error Entry try again ...");

            }
        }

    }

    public static Property addProperty(User owner){
        System.out.println("Add your property :");
        System.out.print("Enter Property name:");
        String name = input.next();
        System.out.print("Enter Property type:");
        String type = input.next();
        System.out.print("Enter Property description:");
        String description = input.next();
        return new Property(name,type,description,owner);
    }
}