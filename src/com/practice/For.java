package com.practice;

import java.util.*;

public class For {

	public static void main(String[] args) {
		/*
		 * int sumEven=0; int sumOdd=0; for(int i=1;i<=100;i++) { if(i%2==0) {
		 * sumEven=sumEven+i; }else { sumOdd=sumOdd+i; } }
		 * System.out.println("sum of even numbers:"+sumEven);
		 * System.out.println("sum of odd numbers:"+sumOdd);
		 */
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter starting value"); int x=sc.nextInt();
		 * System.out.println("Enter ending point"); int y=sc.nextInt(); for(int
		 * i=x;i<=y;i++) { System.out.println(i); }
		 * 
		 * for(int i=5;i>=1;i--) { System.out.println(i); }
		 */
		/*
		 * for(char i='A';i<='Z';i++) { System.out.println(i); } for(char
		 * i='Z';i>='A';i--) { System.out.print(i); }
		 */
		/*
		 * for(char i='A';i<='Z';i++) { System.out.println(i+"--"+(int)i); }
		 */
		/*
		 * for(int i=0;i<20;i++) { if(i%2==0) {
		 * System.out.println("Even numbers are:"+i); }else {
		 * System.out.println("Odd numbers are:"+i); } }
		 */
		/*
		 * int num=98765; int sum=0; for(;num>0;) { int d=num%10; sum=sum+d; num=num/10;
		 * System.out.println(sum); }
		 */
		/*
		 * int n=1234; int sum=0; for(;n>0;n=n/10) { int d=n%10; if(d%2==0) { sum=sum+d;
		 * } }System.out.println(sum);
		 */
		
		//check whether a num is prime
		//print all prime numbers from 1 to N
		//Print multiples of 5
		//Reverse a number
		//ip:12345
		//op:54321
		
		/*
		 * System.out.print("Enter a number: "); int num = sc.nextInt(); int count = 0;
		 * for (int i = 1; i <= num; i++) { if (num % i == 0) { count++; } }
		 * 
		 * if (count == 2) { System.out.println(num + " is a Prime Number"); } else {
		 * System.out.println(num + " is not a Prime Number"); }
		 */
        
		/*
		 * System.out.println("Enter n"); int n=sc.nextInt(); for (int num = 2; num <=
		 * n; num++) {
		 * 
		 * int count = 0;
		 * 
		 * for (int i = 1; i <= num; i++) { if (num % i == 0) { count++; } }
		 * 
		 * if (count == 2) { System.out.print(num + " "); } }
		 */
        
		/*
		 * System.out.println("Enter number"); int n1 = sc.nextInt();
		 * 
		 * for (int i = 5; i <= n1; i = i + 5) { System.out.print(i + " "); }
		 */
		/*
		 * int num=12345; int rev=0; for(;num>0;num=num/10) { int d=num%10;
		 * rev=rev*10+d; } System.out.println(rev);
		 */
		/*
		 * int count = 0; int num = 13453; int sum = 0;
		 * 
		 * for (int i = 1; i <= num; i++) { if (num % i == 0) { count++; } }
		 * 
		 * int temp = num;
		 * 
		 * while (temp > 0) { int digit = temp % 10; sum = sum + digit; temp = temp /
		 * 10; }
		 * 
		 * if (count == 2) { System.out.println(num + " is a Prime Number"); } else {
		 * System.out.println(num + " is not a Prime Number"); }
		 * 
		 * System.out.println("Sum of digits = " + sum);
		 */
		
		int n=13543;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            boolean isPrime=true;
            if(rem<2){
                isPrime=false;
            }for(int i=2;i<=rem/2;i++){
                if(rem%i==0){
                    isPrime=false;
                }
            }if(isPrime){
                sum=sum+rem;
            }
            n=n/10;
        }
        System.out.println(sum);
	}
}