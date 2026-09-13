package com.practice;
enum Methods
{
	
}
public class Ternary {
	public static void main(String[] args) {
//		boolean isRaining=true;
//		String res=isRaining?"Carry unmbella":"Avasarama";
//		System.out.println(res);
//		int day=3;
//		int res2 = day>=0 && day<=5?0:1;
//		System.out.println(res2);
//		int count=0;
//		count++;
//		String res3=count%3==0?"Divisible by 3":"Not divisible by 3";
//		System.out.println(res3);
//		int a = 10;
//		int b = 15;
//		int c = 12;
//
//		String result = a > b && a > c ? "a is greater"
//		                : b > a && b > c ? "b is greater"
//		                : "c is greater";
//
//		System.out.println(result);
//		int age=21;
//		String voting=age>18?"Eligible":"Not Elligible";
//		System.out.println(voting);
//		int n=0;
//		String check=n<=0?"yay zero":"Not a zero";
//		System.out.println(check);
//		
//		int a1 = 30;
//		int b1 = 15;
//		int c1 = 25;
//		String result2=a1<b1 && a1<c1 ?"A is smaller"
//				       : b1<a1 && b1<c1 ?"B is smaller"
//				    		   : "c is smaller";
//		System.out.println(result2);
//		int n1= -7;
//		String result3=n1>=0?"positive"
//				:n1<=0?"Negative"
//						:"Zero";
//	    System.out.println(result3);
//	    int marks = 85;
//	    String mark=marks>=90?"A"
//	    		   :marks>=75 ? "B"
//	    		   :marks>=50?"C"
//	    		: "Fail";
//	    System.out.println(mark);
//	    int a2 = 10;
//	    int b2= 25;
//	    int c2= 15;
//	    String middle=(a2>b2 && a2<c2)||(a2<b2&&a2>c2)?"a is middle"
//	    		:(b2>a2 && b2<c2)||(b2<a2&&b2>c2)?"B is middle"
//	    		:"C is middle" ;
//	    System.out.println(middle);
		
		
//		int n2=-12;
//		String neg=n2>=0?"Positive"
//				:n2<=0?"Negative"
//				:"zero";
//		System.out.println(neg);
//		int n3=27;
//		String even=n3%2==0?"Even"
//				:"odd";
//		System.out.println(even);
//		int x = 35;
//		int y = 18;
//		int z = 27;
//        String small=x<y && x<z?"x is smaller"
//        		    :y<x && y<z?"y is smaller"
//        		    :"z is smaller";
//        System.out.println(small);
//        int num = -16;
//        String neven=num>=0 && num%2==0?"Positive Even"
//        		:num<=0 && num%2==0?"Negative Even"
//        		:"zero";
//        System.out.println(neven);
//        int marks1 = 68;
//        String grade=marks1>=90?"A"
//        		:marks1>=75?"B"
//        		:marks1>=50?"C"
//        		:"Fail";
//        System.out.println(grade);
//        int num2= 45;
//        String div=num2%3==0 && num2%5==0?"Divisible by both 3 nd 5"
//        		:num%3==0?"Divisible by 3 only"
//        		:num%5==0?"Divisible by 5 only"
//        		:"Not divisible by either";
//        System.out.println(div);
//        int l = 40;
//        int m = 15;
//        int n = 25;
//        String middle2=(l<m&&l>n)||(l>m&&l<n)?"l is middle"
//        	           :(m<l && m>n)||(m>l && m<n)?"m is middle"
//        	           :"n is middle";
//        System.out.println(middle2);
		
		
		int units = 350;

		int bill =
		        units <= 100 ? units * 2
		        : units <= 200 ? (100 * 2) + ((units - 100) * 3)
		        : units <= 300 ? (100 * 2) + (100 * 3) + ((units - 200) * 5)
		        : (100 * 2) + (100 * 3) + (100 * 5) + ((units - 300) * 7);

		System.out.println("Bill = ₹" + bill);
		int a = 25;
		int b = 25;
		int c = 15;
		String great=(a>=b && a>=c) && (b>=a && b>=c)?"A and B is greatest"
				:(a>=b && a>=c) && (c>=a && c>=b)?"A and C is greater"
				:(b>=a && b>=c) && (c>=a && c>=b)?"B and C is greater"
				:"All are equal";		
		System.out.println(great);
		int x = 45;
		int y = 20;
		int z = 35;
		String second=(x>y && x<z) || (x<y && x>z)?"45 is second greatest"
				:(y<x && y>z)||(y>x && y<z)?"20 is second greatest"
				:"35 is second greatest";
		System.out.println(second);
		int num = -27;

		String neven =
		        num == 0 ? "Zero"
		        : num > 0 && num % 2 == 0 ? "Positive Even"
		        : num > 0 && num % 2 != 0 ? "Positive Odd"
		        : num < 0 && num % 2 == 0 ? "Negative Even"
		        : "Negative Odd";

		System.out.println(neven);
      int n = 60;
      String division=(n%2==0&&n%3==0&&n%5==0)?"Divisinle by 2,3 and 5"
    		  :(n%2==0&&n%3==0)?"Divisible by 2 nd 3"
    		  :(n%2==0&&n%5==0)?"Divisible by 2 and 5"
    		  :(n%3==0&&n%5==0)?"Divisible by 3 and 5"
    		  :(n%2==0)?"Divisible only by 2"
    		  :(n%3==0)?"Divisible only by 3"
    		  :(n%5==0)?"Divisible only by 5"
    			:"Not divisible by 2,3 and 5";
      System.out.println(division);
      int i = 5;
      int j = 5;
      int k = 8;

      String triangle =
              !(i + j > k && i + k > j && j + k > i) ? "Invalid Triangle"
              : i == j && j == k ? "Equilateral"
              : i == j || i == k || j == k ? "Isosceles"
              : "Scalene";

      System.out.println(triangle);
     int month = 2;
     int year = 2024;
     int day=29;
     boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

     String date =
             month < 1 || month > 12 ? "Invalid Month"
             : day < 1 ? "Invalid Day"
             : month == 2 && day <= (leap ? 29 : 28) ? "Valid Date"
             : month == 2 ? "Invalid Date"
             : (month == 4 || month == 6 || month == 9 || month == 11) && day <= 30 ? "Valid Date"
             : (month == 4 || month == 6 || month == 9 || month == 11) ? "Invalid Date"
             : day <= 31 ? "Valid Date"
             : "Invalid Date";

     System.out.println(date);
     int balance = 10000;
     int amount = 3500;
     boolean cardValid = true;
     String bank =
    		    !cardValid ? "Invalid card"
    		    : amount <= 0 ? "Invalid amount"
    		    : amount > balance ? "Insufficient balance"
    		    : "Withdrawal successful Remaining balance: " + (balance - amount);
     System.out.println(bank);
	}

}
