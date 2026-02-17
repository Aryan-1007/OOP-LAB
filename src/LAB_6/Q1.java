package LAB_6;

import java.util.Scanner;

class Car {
    String company;
    Car(String name){
        this.company=name;
    }
}
class ModelDetails extends Car{
    int ModelNo;
    String EngineType;

    ModelDetails(String name,int n,String engineType) {
        super(name);
        this.ModelNo=n;
        this.EngineType=engineType;
    }
}
public class Q1 {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the company of the car: ");
        String car= input.nextLine();
        System.out.println("Enter the Model Number of the car: ");
        int model= input.nextInt();
        System.out.println("Enter the engine type of the car: ");
        String engine= input.next();

        ModelDetails md=new ModelDetails(car,model,engine);
        System.out.println("Your car details are as follows");
        System.out.println("Company: "+ md.company);
        System.out.println("Model Number: "+ md.ModelNo);
        System.out.println("Engine Type: "+ md.EngineType);
    }
}
