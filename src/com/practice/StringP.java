package com.practice;

import java.util.Arrays;

public class StringP {

	public static void main(String[] args) {
		// first way of creating
		/*String s1="Renu";
		String email="renu@gmail.com";*/
		
//		second way 
		/*String s1=new String("Renu");
		
		System.out.println(s1);
		System.out.println(new StringP());
		System.out.println(email);
		System.out.println(s1+email);*/
		
		/*String s1="Renu";
		String s2=new String("Renu");
		String s3="Renu";
		String s4=new String("Renu");
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s2==s4);//false coz address is dfrnt !
		System.out.println(s2.equals(s4));
		//true bcoz its compares the data
		*/
		
		//methods
		String s1="Renu";
		String s2="REnu";
		String s3=" RENU SRI ";
		String s4="You know me very well";
		String s5="987654321";
		String s6;
		String s7=" ";
		String s8="";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.contains("u"));//true
		System.out.println(s1.contains("Y"));//f
		System.out.println(s1.startsWith("R"));//t
		System.out.println(s1.endsWith("u"));//t
		System.out.println(s3.length());
		System.out.println(s3.trim());//removes the starting and ending spaces
		System.out.println(s3.trim().length());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toCharArray());
		System.out.println(s1.indexOf("n"));
		System.out.println(s1.lastIndexOf("u"));
		System.out.println(s3.substring(3));//creates string from that index
		System.out.println(s4.split(" "));
		System.out.println(Arrays.toString(s4.split(" ")));//youll get like a array
		System.out.println(s4.charAt(5));
		System.out.println(s4.replace("you","she"));
		System.out.println(Integer.valueOf(s5));//the output will be in integer only means you are checking the valueof a integer
		System.out.println(s7.length());
		System.out.println(s7.isEmpty());//length ni base chesthadhi
		System.out.println(s7.trim().isEmpty());
		System.out.println(s7.isBlank());//trim chesi verify chesthadhi
	}

}
