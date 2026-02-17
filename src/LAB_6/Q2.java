package LAB_6;

import java.util.Scanner;

class TotalProfit
{
    protected int attendees;
    protected double prof =20;

    TotalProfit(int attendees)
    {
        this.attendees=attendees;
    }
    void profit()
    {   prof=((double)attendees*(0.5+5.0))-20;
        System.out.println("Total Profit earned by the theatre: $"+ prof );
    }
}
public class Q2 {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of attendees at the show: ");
        int attendees=input.nextInt();
        TotalProfit theatre=new TotalProfit(attendees);
        theatre.profit();
    }
}
