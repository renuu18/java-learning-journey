package com.practice;
import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
 
	Scanner scanner=new Scanner(System.in);
	String day=scanner.nextLine();
	if(day!= "Monday") {
		System.out.println("You have a class");
	}
	else {
		System.out.println("No class");
	}
	}

}
