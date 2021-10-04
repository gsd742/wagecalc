package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    System.out.println("what ur name?");
    String name= input.nextLine() ;
    System.out.println("how many hours have u worked this week?");
    double hoursworked = input.nextInt();
    System.out.println("what's your hourly wage?");
    double wage = input.nextInt();
    if (hoursworked<45) {
        double ww = hoursworked * wage;
        double tax  = ww * 0.8;
        System.out.println("you worked "+hoursworked+" before tax this is "+ ww +" after tax it's "+ tax);
    }
    else {
        double ww = ((hoursworked-45)*(wage*1.5))+(45*wage);
        double tax  = ww * 0.8;
        System.out.println("you worked "+hoursworked+" before tax this is "+ ww +" after tax it's "+ tax);
    }
    }
}
