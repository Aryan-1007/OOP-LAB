package com.LAB6;

public class WashingMachine {

    public void switchOn() {
        System.out.println("Washing Machine Switched ON");
    }

    public int acceptClothes(int noOfClothes) {
        System.out.println("Accepted Clothes: " + noOfClothes);
        return noOfClothes;
    }

    public void acceptDetergent() {
        System.out.println("Detergent Added");
    }

    public void switchOff() {
        System.out.println("Washing Machine Switched OFF");
    }
}
