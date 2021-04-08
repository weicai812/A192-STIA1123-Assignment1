package my.example;

import java.util.Scanner;

public class Receipt {

    private static NextDayDelivery_interface nextDayDelivery_interface = new NextDayDelivery(0, 0, "", 0);
    private static SameDayDelivery_abstract sameDayDelivery_abstract = new SameDayDelivery();
    private static PrepaidBoxEnvelope prepaidBoxEnvelope = new PrepaidBoxEnvelope();
    private static PosEkspres posEkspres = new PosEkspres();
    public static double totalcharge1[] = nextDayDelivery_interface.getTotalCharge();
    public static double totalcharge2[]= sameDayDelivery_abstract.getTotalCharge();
    public static double totalcharge3[]= prepaidBoxEnvelope.getTotalCharge();
    public static double totalcharge4[]= posEkspres.getTotalCharge();

    public static void choice() {
        Scanner input = new Scanner(System.in);
        int choice;

        displayMenu();
        System.out.printf("Enter your choice\t:");
        choice = input.nextInt();

        if (choice > 2) {
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice = input.nextInt();
        }

        if (choice == 1) {
            Loop();
            choice();

            if (choice > 2) {
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                choice = input.nextInt();
            }

        }
        else if (choice == 2) {
            MainMenu.displaymenu();
            MainMenu.choice(input.nextInt());
        }
    }

    public static void Loop(){
        int customer, line= 0;
        double grandtotal = 0;

        for (customer = 0; customer < totalcharge1.length; customer++) {

            /*Display Customer*/
            System.out.printf("\nCustomer %d:\n", customer + 1);
            System.out.printf("------------------\n");

            //Calculate Grand Total
            grandtotal = totalcharge1[customer] + totalcharge2[customer]+ totalcharge3[customer]/* + totalcharge4[customer]*/;

            //Display Receipt
            System.out.printf("Total Charge:\n");
            System.out.printf("Next-Day Delivery\t\t\tRM%10.2f\n", totalcharge1[customer]);
            System.out.printf("Same-Day Delivery\t\t\tRM%10.2f\n", totalcharge2[customer]);
            System.out.printf("Prepaid Box & Envelope\t\tRM%10.2f\n", totalcharge3[customer]);
            System.out.printf("Pos Ekspres\t\t\t\t\tRM%10.2f\n", totalcharge4[customer]);
            line = 1;
            while (line <= 60) {
                System.out.printf("%c", 45);
                line++;
            }
            System.out.printf("\nTotal \t\t\t\t\t\tRM%10.2f\n\n", grandtotal);

        }
    }
    public static void displayMenu(){
        System.out.printf("1. Display Receipt\n");
        System.out.printf("2. Return to Main Menu\n");
    }
}