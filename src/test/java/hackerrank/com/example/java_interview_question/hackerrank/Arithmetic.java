package com.example.java_interview_question.hackerrank;
import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tip = (mealCost*tipPercent)/100;
        double tax = (mealCost*taxPercent)/100;   
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost1 = (int) Math.round(tax);
        int totalCost2 = (int) Math.round(tip);
        int totalCost = (int) (mealCost + totalCost1 + totalCost2);
       System.out.println(totalCost);
    }
}