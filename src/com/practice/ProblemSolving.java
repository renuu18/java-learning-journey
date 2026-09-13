package com.practice;
import java.util.*;
public class ProblemSolving {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	/*
	 * int radius=sc.nextInt(); double area=3.142*radius*radius;
	 * System.out.printf("%.4f",area);
	 */
	 
	
	/*
	 * int radius=sc.nextInt(); double circumference=2*3.142*radius;
	 * System.out.printf("%.4f",circumference);
	 */
	
	/*
	 * int celsius=sc.nextInt(); double fahrenhit=(celsius*9/5.0)+32;
	 * System.out.printf("%1.4f",fahrenhit);
	 */
	
	/*
	 * int fahrenheit=sc.nextInt(); double Celsius=(fahrenheit-32)*5.0/9.0;
	 * System.out.printf("%.4f",Celsius);
	 */
	
	/*
	 * int radius=sc.nextInt(); int height=sc.nextInt(); double
	 * area=2*3.124*radius*(radius+height); System.out.printf("%.4f",area);
	 */
	
	System.out.println("Enter values");
	byte b = sc.nextByte();
	short s = sc.nextShort();
	int i = sc.nextInt();
	long l = sc.nextLong();
	float f = sc.nextFloat();
	double d = sc.nextDouble();
	char c = sc.next().charAt(0);
	boolean bool = sc.nextBoolean();
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(bool);
	
	}
}
