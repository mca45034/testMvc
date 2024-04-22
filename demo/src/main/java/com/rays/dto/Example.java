package com.rays.dto;

public class Example {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				System.out.print(" ");
				if(i==3 || j==3) {
				System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}