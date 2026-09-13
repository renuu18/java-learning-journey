package com.practice;
import java.util.*;

class Switch {
    public static void main(String[] args) {

//        System.out.println("Select the option:");
//        System.out.println("1. Dosa");
//        System.out.println("2. Idly");
//        System.out.println("3. Bonda");
//        System.out.println("Select your option:");
//
//        Scanner sc = new Scanner(System.in);
//        int option = sc.nextInt();
//
//        switch(option) {
//            case 1 -> {
//                System.out.println("Dosa");
//            }
//            case 2 -> {
//                System.out.println("Idly");
//            }
//            case 3 -> {
//                System.out.println("Bonda");
//            }
//            default -> {
//                System.out.println("Item not found");
//            }
//        }

//    	        Scanner sc = new Scanner(System.in);
//
//    	        System.out.println("Choose your option:");
//    	        System.out.println("Addition");
//    	        System.out.println("Subtraction");
//    	        System.out.println("Multiplication");
//    	        System.out.println("Division");
//
//    	        System.out.println("Enter your option:");
//    	        String option = sc.next();
//
//    	        System.out.println("Enter your values:");
//    	        int a = sc.nextInt();
//    	        int b = sc.nextInt();
//
//    	        switch(option) {
//
//    	            case "Addition" -> {
//    	                System.out.println("Addition is: " + (a + b));
//    	            }
//
//    	            case "Subtraction" -> {
//    	                System.out.println("Subtraction is: " + (a - b));
//    	            }
//
//    	            case "Multiplication" -> {
//    	                System.out.println("Multiplication is: " + (a * b));
//    	            }
//
//    	            case "Division" -> {
//    	                System.out.println("Division is: " + (a / b));
//    	            }
//
//    	            default -> {
//    	                System.out.println("Invalid input");
//    	            }
//    	        }
  
//    	        String day = "Tuesday";
//
//    	        switch(day) {
//    	            case "Monday" -> {
//    	                System.out.println("Monday");
//    	            }
//    	            case "Tuesday" -> {
//    	                System.out.println("Tuesday");
//    	            }
//    	            case "Wednesday" -> {
//    	                System.out.println("Wednesday");
//    	            }
//    	            case "Thursday" -> {
//    	                System.out.println("Thursday");
//    	            }
//    	            case "Friday" -> {
//    	                System.out.println("Friday");
//    	            }
//    	            case "Saturday" -> {
//    	                System.out.println("Saturday");
//    	            }
//    	            default -> {
//    	                System.out.println("Sunday");
//    	            }
//    	        }/
    	
//    	        String day = "Tuesday";
//
//    	        switch(day) {
//    	            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
//    	                System.out.println("WEEKDAY");
//    	            }
//
//    	            case "Saturday", "Sunday" -> {
//    	                System.out.println("Weekend");
//    	            }
//
//    	            default -> {
//    	                System.out.println("Invalid");
//    	            }
//    	        }
    	        int month = 5;

    	        switch(month) {
    	            case 0, 2, 4, 6, 7, 9, 11 -> {
    	                System.out.println("31 days");
    	            }

    	            case 3, 5, 8, 10 -> {
    	                System.out.println("30 days");
    	            }

    	            case 1 -> {
    	                System.out.println("28 days");
    	            }

    	            default -> {
    	                System.out.println("Invalid");
    	            }
    	        }
    	 }
}
