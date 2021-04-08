package my.example;

import java.util.Scanner;


public class PrepaidBoxEnvelope extends Calculation{
    public static double totalcharge3[] = new double[3];

    public void choice() {

        Scanner input = new Scanner(System.in);

        int choice;

        //Display Menu/
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");

        System.out.printf("Enter your choice\t\t:");
        choice = input.nextInt();
        if (choice > 2) {
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice = input.nextInt();
        }

        if (choice == 1) {
            PrepaidBoxEnvelope();
            Loop();

            choice();

            if (choice > 2) {
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                choice = input.nextInt();
            }

        }
        else  if (choice == 2) {
            MainMenu.displaymenu();
            MainMenu.choice(input.nextInt());
        }
    }

    public void Loop() {

        Scanner input = new Scanner(System.in);

        int customer, quantity;
        String ItemType;
        double weight;
        double totalprice = 0;

        for (customer = 0; customer < totalcharge3.length; customer++) {

            //Display Customer/
            System.out.printf("\nCustomer %d:\n", customer + 1);
            System.out.printf("----------------------\n");

            totalcharge3[customer] = 0;

            //Input First Item Type/
            System.out.printf("\nEnter your item (Envelope S/M or Prepaid Box S/M/L /X to quit)\t:");
            ItemType = input.next() + input.nextLine();
            ItemType = ItemType.toUpperCase();

            //Loop/
            while (!ItemType.equals("X")) {

                //Input Quantity/
                System.out.printf("Enter your quantity\t\t\t\t\t\t:");
                quantity = input.nextInt();

                //Input Weight/
                System.out.printf("Enter your weight\t\t\t\t\t\t:");
                weight = input.nextDouble();
                while (weight > 10000) {
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t\t\t\t\t:");
                    weight = input.nextDouble();
                }
                while (weight <= 10000) {
                    break;
                }

                //Call calTotalPrice/
                totalprice = calTotalPrice(weight, quantity);

                //Display Charges/
                System.out.printf("Charges in %s is RM%.2f\n", ItemType, totalprice);

                //Accumulate Total Charge/
                totalcharge3[customer] = totalprice;

                //Input First Item Type/
                System.out.printf("\nEnter your item (Envelope S/M or Prepaid Box S/M/L /X to quit)\t:");
                ItemType = input.next() + input.nextLine();
                ItemType = ItemType.toUpperCase();

            }
            System.out.printf("All charges in RM%.2f\n", totalcharge3[customer]);
        }
    }

    @Override
    public double calTotalPrice(double weight, int quantity) {

        double price = 0;
        double totalprice;

        if (weight <= 500) {
            price = 7.31;
        }
        if (weight > 500 && weight <= 1000) {
            price = 10.49;
        }
        if (weight > 1000 && weight <= 2000) {
            price = 13.78;
        }
        if (weight > 2000 && weight <= 5000) {
            price = 21.20;
        }
        if (weight > 5000 && weight <= 10000) {
            price = 31.80;
        }
        totalprice = price * quantity;
        return totalprice;
    }

    public static double[] getTotalCharge() {

        return totalcharge3;
    }
}
