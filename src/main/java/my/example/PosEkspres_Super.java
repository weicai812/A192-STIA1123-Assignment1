package my.example;

import java.util.Scanner;

public class PosEkspres_Super extends Calculation {
    PosEkspres_Super(){
        super();
    }

    public static double totalcharge4[]=new double[3];

    public void choice(){

        Scanner input=new Scanner(System.in);

        int choice;

        //Display Menu/
        System.out.printf("1. Input your data\n");
        System.out.printf("2. Return to Main Menu\n");

        System.out.printf("Enter your choice\t:");
        choice=input.nextInt();
        while(choice>2){
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Enter your choice\t:");
            choice=input.nextInt();
        }

        if(choice==1){

            posEkspres();
            Loop();
            choice();

            if (choice>2){
                System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                System.out.printf("Enter your choice\t:");
                choice=input.nextInt();
            }

        }else if(choice==2){
            MainMenu.displaymenu();
            MainMenu.choice(input.nextInt());
        }
    }


    public void Loop() {

        Scanner input=new Scanner(System.in);

        //Declaration/
        int quantity;
        int customer;
        String ItemType;
        double weight;
        double totalprice;

        for(customer=0;customer<totalcharge4.length;customer++){

            //Display Customer/
            System.out.printf("\n\nCustomer %d:\n",customer+1);
            System.out.printf("----------------------\n");

            totalcharge4[customer]=0;

            //Input First Item Type/
            System.out.printf("\nEnter your item (LG/LE/LD/LK/X to quit)):");
            ItemType=input.next();
            ItemType=ItemType.toUpperCase();

            //Loop/
            while(!ItemType.equals("X")){

                //Input Quantity/
                System.out.printf("Enter your quantity\t\t\t\t\t:");
                quantity=input.nextInt();

                //Input Weight/
                System.out.printf("Enter your weight\t\t\t\t\t:");
                weight=input.nextDouble();
                while(weight>1000){
                    System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
                    System.out.printf("Enter your weight\t\t:");
                    weight=input.nextDouble();
                }while(weight<=1000){
                    break;
                }

                //Call calTotalPrice/
                totalprice=calTotalPrice(quantity,weight);

                //Display Charges/
                System.out.printf("Charges in %s is RM%.2f\n",ItemType,totalprice);

                //Accumulate Total Charge/
                totalcharge4[customer]+=totalprice;

                //Input First Item Type/
                System.out.printf("\nEnter your item (LG/LE/LD/LK/X to quit)):");
                ItemType=input.next();
                ItemType=ItemType.toUpperCase();

            }
            System.out.printf("All charges in RM%.2f\n",totalcharge4[customer]);
        }

    }
    public double calTotalPrice(int quantity, double weight) {

        double price=0;
        double totalprice;

        if(weight<=100){
            price=3.18;
        }if(weight>100&&weight<=250){
            price=3.71;
        }if(weight>250&&weight<=500){
            price=4.77;
        }if(weight>500&&weight<=1000){
            price=7.42;
        }

        totalprice=price*quantity;

        return totalprice;
    }

}
