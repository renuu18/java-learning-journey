package com.practice;

public class Test {
	static int currentbalance=1000;
	public static void greetcustomer() {
		System.out.println("Hello");
	}
   public static void deposit(int amount) {
	   currentbalance=currentbalance+amount;
	   System.out.println("Amount deposited successfully");
   }
   public static void withdrawal(int amount) {
	   currentbalance=currentbalance-amount;
	   System.out.println("Amount withdrawn successfully");
   }
   public int getcurrentbalance() {
	   return currentbalance;
   }
	public static void main(String[] args) {
		Test test=new Test();
		greetcustomer();
		System.out.println("current balance:"+test.getcurrentbalance());
		deposit(1000);
		System.out.println("current balance:"+test.getcurrentbalance());
		withdrawal(300);
		System.out.println("current balance:"+test.getcurrentbalance());
		
	}

}
