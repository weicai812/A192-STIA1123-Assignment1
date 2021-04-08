package my.example;
import java.util.Scanner;

public class MainMenu {
    private int choice;

    public static void line() {
        int line = 1;
        while (line <= 100) {
            System.out.printf("%c", 45);
            line++;
        }
    }

    public static void displaymenu() {
        //Display Main Menu/
        System.out.printf("Main Menu\n");
        line();
        //Display Main Menu/
        System.out.printf("\n1. Next-Day Delivery\n");
        System.out.printf("2. Same-Day Delivery\n");
        System.out.printf("3. Prepaid Box & Envelope\n");
        System.out.printf("4. Pos Ekspres\n");
        System.out.printf("5. Receipt\n");
        System.out.printf("6. Exit\n\n");
        System.out.printf("Please select your choice\t:");
    }


    public static void choice(int choice) {
        int zone=0,customer=0;
        String type="";
        double weight=0;
        Scanner scan= new Scanner(System.in);

        if (choice > 6) {
            System.out.printf("Invalid Input!!! Please key in correct data!!!\n");
            System.out.printf("Please select your choice:");
            choice(choice=scan.nextInt());
        }
        while (choice <= 6) {
            break;
        }
        //Selection/
        if (choice == 1) {
            NextDayDelivery_interface nextDayDelivery_interface = new NextDayDelivery(zone,customer,type,weight);
            nextDayDelivery_interface.choice();

        }else if (choice==2){
            SameDayDelivery_abstract sameDayDelivery_abstract = new SameDayDelivery();
            sameDayDelivery_abstract.choice();

        }else if(choice==3){
            PrepaidBoxEnvelope prepaidBoxEnvelope = new PrepaidBoxEnvelope();
            prepaidBoxEnvelope.choice();

        }if(choice==4){
            PosEkspres posEkspres= new PosEkspres();
            posEkspres.choice();

        }else if(choice==5){
            Receipt receipt=new Receipt();
            receipt.choice();

        }else if(choice==6){
            System.out.printf("Thank You for Using Our System.\n");
        }
    }

}
