### Read the instruction at `INSTRUCTION.md`

## Student Info:
1. Matric Number & Name & Photo

GAN WEI CAI (269979)

![photo_2020-05-13_01-08-09](https://user-images.githubusercontent.com/60889205/82022179-cae24300-96be-11ea-80ab-a57e9b07f666.jpg)


2. Other related info (if any)

## Introduction:

This system is about the Pos Laju Malysia System which can help the user to calculate the price and display the receipt for the customers. This system build up by using the Object Oriented Programming (OOP) concept which are abstraction, encapsulation, polymorphism and inherintance. In abstraction concept, this system uses abstract class and interface class. In the inhenritance concept, this system uses super class to inhenrit the system.

## Screenshot all the Output/Result:

![1](https://user-images.githubusercontent.com/60889205/82318019-be812180-9a01-11ea-97da-03e833a5d190.PNG)
![2](https://user-images.githubusercontent.com/60889205/82318021-bf19b800-9a01-11ea-9b62-68b3b2a1eeae.PNG)
![3](https://user-images.githubusercontent.com/60889205/82318023-bfb24e80-9a01-11ea-830d-8c4752b3cd16.PNG)
![4](https://user-images.githubusercontent.com/60889205/82318025-bfb24e80-9a01-11ea-9d9a-846b8f8eb09b.PNG)
![5](https://user-images.githubusercontent.com/60889205/82318028-c04ae500-9a01-11ea-89fa-20939bca0c73.PNG)
![6](https://user-images.githubusercontent.com/60889205/82318003-ba550400-9a01-11ea-9b6c-1a5261a2f445.PNG)
![7](https://user-images.githubusercontent.com/60889205/82318006-bc1ec780-9a01-11ea-9f17-ab7dea7a2874.PNG)
![8](https://user-images.githubusercontent.com/60889205/82318008-bc1ec780-9a01-11ea-98c8-c056aea7e214.PNG)
![9](https://user-images.githubusercontent.com/60889205/82318009-bcb75e00-9a01-11ea-96ed-79b96b4db826.PNG)
![10](https://user-images.githubusercontent.com/60889205/82318010-bd4ff480-9a01-11ea-83ec-c50b84c17000.PNG)
![11](https://user-images.githubusercontent.com/60889205/82318014-bde88b00-9a01-11ea-8aee-833803439534.PNG)
![12](https://user-images.githubusercontent.com/60889205/82318018-bde88b00-9a01-11ea-8791-36c53e63f4ee.PNG)

## UML Class Diagram:

![Assignment 1 UML](https://user-images.githubusercontent.com/60889205/82065646-f554f000-9700-11ea-92be-51171adbb57c.PNG)

## How to run this program?

The methods to run this program should be follow the step:

1. When start running the program, it will display the Menu which can let the user to make a choice for the types of delivery.

2. When the user make the choice for the types of delivery, it will ask the user to make the choice wherether to input the data or return to the Menu.

3. When the user make the choice to input the data, it will display the price table and get the input fromn the user for customer 1. After the user input the data for customer 1, user can key "X" to turn to customer 2 and after input "X" again to customer3. The system can only store 3 customer data so when the user input "X" after the customer 3, it will display the confirmation menu to exit to Menu.

4. After user input all the data, the user can display the receipt by input "5" in the Menu choice.

5. The user also can stop the program by inputing "6" to exit.

## Example of your program:

1. Abstraction

Interface
```java
package A1;

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
 ```

Abstract class
```java
package A1;

public abstract class SameDayDelivery_abstract extends Calculation {
    public abstract void choice();
    public abstract double [] getTotalCharge();
}
```
2. Encapsulation
```java
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
```
    
3. Polymorphism
```java
  public double calCharge(double weight, int zone){

        return calcharge;
    }

    public double calCharge(double weight,String towntype){

        return calcharge;
    }

    public double calTotalPrice(double weight, int quantity){

        return totalprice;
    }
    public double calTotalPrice(int quantity, double weight){

        return totalprice;
    }
```

4. Inheritance
```java
public class PosEkspres_Super extends Calculation {
    PosEkspres_Super(){
        super();
    }
```
```java
public class PosEkspres extends PosEkspres_Super{
    public double[] getTotalCharge(){

        return totalcharge4;
    }
}
```
