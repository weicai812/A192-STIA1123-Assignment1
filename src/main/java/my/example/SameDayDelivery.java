package my.example;

import java.util.Scanner;

public class SameDayDelivery extends SameDayDelivery_abstract{
    public static double totalcharge2[]=new double[3];

    public void choice(){

        Scanner input=new Scanner(System.in);

        int choice;
        displayMenu();

        System.out.printf("Enter your choice\t\t:");
        choice=input.nextInt();
        if (choice>2){
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice=input.nextInt();
        }

        if(choice==1){
            SameDayDelivery();
            Loop();
            choice();

            if (choice>2){
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t\t\t:");
                choice=input.nextInt();
            }

        }
        else if(choice==2){
            MainMenu.displaymenu();
            MainMenu.choice(input.nextInt());
        }
    }

    public void Loop() {

        Scanner input=new Scanner(System.in);

        int customer;

        String towntype;
        double weight;
        double payment=0;

        for(customer=0;customer<totalcharge2.length;customer++){

            //Display Customer/
            System.out.printf("\n\nCustomer %d:\n",customer+1);
            System.out.printf("----------------------\n");

            totalcharge2[customer]=0;

            //Input First Town Type/
            System.out.printf("\nEnter your town-type (Local/Cross/X to quit):");
            towntype=input.next();
            towntype=towntype.toUpperCase();

            //Loop/
            while(!towntype.equals("X")){

                //Input Weight/
                System.out.printf("Enter your weight\t\t\t\t\t\t:");
                weight=input.nextDouble();
                while(weight>1000){
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t\t\t\t\t:");
                    weight=input.nextDouble();
                }while(weight<=1000){
                    break;
                }

                //Call calPayment/
                payment=calCharge(weight,towntype);

                //Display Charges/
                System.out.printf("Charges in %s is RM%.2f\n",towntype,payment);

                //Accuumulate Total Charge/
                totalcharge2[customer]+=payment;

                //Input Next Town Type/
                System.out.printf("\nEnter your town-type (Local/Cross/X to quit):");
                towntype=input.next();
                towntype=towntype.toUpperCase();
            }
            System.out.printf("All charges in RM%.2f\n",totalcharge2[customer]);
        }
    }

    public void displayMenu(){
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");
    }

    @Override
    public double calCharge(double weight,String towntype) {

        double payment=0;
        double surcharge=0;
        double domestic_charge=0;

        switch(towntype){

            case "LOCAL":if(weight<=500){
                domestic_charge=4.90;
                surcharge=6.00;
            }if(weight>500&&weight<=750){
                domestic_charge=5.70;
                surcharge=6.00;
            }if(weight>750&&weight<=1000){
                domestic_charge=6.50;
                surcharge=6.00;
            }break;
            case "CROSS":if(weight<=500){
                domestic_charge=5.40;
                surcharge=7.50;
            }if(weight>500&&weight<=750){
                domestic_charge=6.40;
                surcharge=7.50;
            }if(weight>750&&weight<=1000){
                domestic_charge=7.40;
                surcharge=7.50;
            }break;
        }
        payment=domestic_charge+surcharge;
        return payment;
    }

    public double[] getTotalCharge(){
        return totalcharge2;
    }
}
