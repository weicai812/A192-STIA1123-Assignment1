package my.example;

import java.util.Scanner;

public class NextDayDelivery extends Calculation implements NextDayDelivery_interface{
    Scanner input = new Scanner(System.in);
    public static double totalcharge1[] = new double[3];

    private int choice;
    private int zone;
    int customer;
    private String packagetype;
    private double weight;
    double charge;

    public NextDayDelivery(int choice,int zone, String packagetype, double weight) {
        this.choice=choice;
        this.zone = zone;
        this.packagetype=packagetype;
        this.weight = weight;
    }


    @Override
    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public void setWeight(double weight) {
        this.weight=weight;
    }

    @Override
    public void setPackagetype(String packagetype) {
        this.packagetype = packagetype;
    }

    @Override
    public void setChoice(int choice){
        this.choice=choice;
    }

    @Override
    public int getZone() {
        return zone;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getPackagetype() {
        return packagetype;
    }

    @Override
    public int getChoice() {
        return choice;
    }

    public void choice() {
        Menu();

        System.out.printf("Enter your choice\t\t\t:");
        setChoice(input.nextInt());

         if (choice > 2) {
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            setChoice(input.nextInt());
        }

        if (choice == 1) {
            NextDayDelivery();
            Loop();
            choice();

            if (choice > 2) {
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                setChoice(input.nextInt());
            }
        }

        else if (choice == 2) {
            MainMenu.displaymenu();
            MainMenu.choice(input.nextInt());
        }

    }

    public void Loop(){

        for (customer = 0; customer < totalcharge1.length; customer++) {

            //Display Customer/
            System.out.printf("\nCustomer %d:\n", customer + 1);
            System.out.printf("----------------------\n");

            totalcharge1[customer] = 0;

            //Input First Package Type/
            System.out.printf("\nEnter your package type(X to quit)\t:");
            setPackagetype(packagetype=input.next().toUpperCase());

            //Loop/
           while (!packagetype.equals("X")) {

                //input weight and zone/
                System.out.printf("Enter your weight\t\t\t\t\t:");
                setWeight(input.nextDouble());
                System.out.printf("Enter your zone\t\t\t\t\t\t:");
                setZone(input.nextInt());
                while (zone > 5) {
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your zone\t\t\t\t\t\t:");
                    setZone(input.nextInt());
                }
                while (zone <= 5) {
                    break;
                }

                //Call calCharge
                charge = calCharge(weight, zone);

                //Display Charges
                System.out.printf("Charges in %s is RM%.2f\n", packagetype, charge);

                //Accuumulate Total Charge
                totalcharge1[customer] += charge;

                //Input First Package Type
                System.out.printf("\nEnter your package type(X to quit)\t:");
                setPackagetype(input.next().toUpperCase());

            }
            System.out.printf("All charges in RM%.2f\n", totalcharge1[customer]);
        }
    }

    @Override
    public double calCharge(double weight, int zone) {

        switch (zone) {
            case 1:
                if (weight <= 2000) {
                    if (weight <= 2000) {
                        charge = 4.90 + (weight - 500) / 250 * 0.80;
                    }
                    if (weight <= 500) {
                        charge = 4.90;
                    }
                }
                if (weight > 2000) {
                    if (weight <= 2500) {
                        charge = 10.50;
                    }
                    if (weight > 2500) {
                        charge = 10.50 + (weight - 2500) / 500 * 0.50;
                    }
                }
                break;
            case 2:
                if (weight <= 2000) {
                    if (weight <= 2000) {
                        charge = 5.40 + (weight - 500) / 250 * 1.00;
                    }
                    if (weight <= 500) {
                        charge = 5.40;
                    }
                }
                if (weight > 2000) {
                    if (weight <= 2500) {
                        charge = 16.00;
                    }
                    if (weight > 2500) {
                        charge = 16.00 + (weight - 2500) / 500 * 2.00;
                    }
                }
                break;
            case 3:
                if (weight <= 2000) {
                    if (weight <= 2000) {
                        charge = 6.90 + (weight - 500) / 250 * 1.50;
                    }
                    if (weight <= 500) {
                        charge = 6.90;
                    }
                }
                if (weight > 2000) {
                    if (weight <= 2500) {
                        charge = 21.00;
                    }
                    if (weight > 2500) {
                        charge = 21.00 + (weight - 2500) / 500 * 3.00;
                    }
                }
                break;
            case 4:
                if (weight <= 2000) {
                    if (weight <= 2000) {
                        charge = 7.40 + (weight - 500) / 250 * 1.50;
                    }
                    if (weight <= 500) {
                        charge = 7.40;
                    }
                }
                if (weight > 2000) {
                    if (weight <= 2500) {
                        charge = 26.00;
                    }
                    if (weight > 2500) {
                        charge = 26.00 + (weight - 2500) / 500 * 3.50;
                    }
                }
                break;
            case 5:
                if (weight <= 2000) {
                    if (weight <= 2000) {
                        charge = 7.90 + (weight - 500) / 250 * 2.00;
                    }
                    if (weight <= 500) {
                        charge = 7.90;
                    }
                }
                if (weight > 2000) {
                    if (weight <= 2500) {
                        charge = 31.00;
                    }
                    if (weight > 2500) {
                        charge = 31.00 + (weight - 2500) / 500 * 4.00;
                    }
                }
                break;
        }
        return charge;
    }

    public void Menu(){
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");
    }

    public double[] getTotalCharge() {

        return totalcharge1;
    }
}
