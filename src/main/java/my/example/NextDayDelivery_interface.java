package my.example;

import java.util.Scanner;

public interface NextDayDelivery_interface{
    void choice();
    void setZone(int zone);
    void setPackagetype(String packagetype);
    void setWeight(double weight);
    void setChoice(int choice);
    int getZone();
    int getChoice();
    double getWeight();
    String getPackagetype();
    double [] getTotalCharge();



}
