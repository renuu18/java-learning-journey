package com.practice;

public class Arey {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sum=0;
		for(int i=0;i<arr[2][3];i++) {
			for(int j=i;j<arr[5][3];j++) {
				for(int k=0;k<arr[8][3];k++) {
					sum=sum+arr[i][j];
				}
			
		}
		System.out.println(sum);
	}
}
}