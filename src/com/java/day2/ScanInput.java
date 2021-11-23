package com.java.day2;

import java.util.Scanner;

public class ScanInput {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ur name:");
		String name = sc.next();
		System.out.println("ur name is: "+name);
		
		sc.nextLine();
		
		System.out.println("enter ur course:");
		String course = sc.nextLine();
		System.out.println("ur course is:"+course);
		
		System.out.println("enter ur id:");
		int id = sc.nextInt();
		System.out.println("ur id:"+id);
		
		System.out.println("enter ur phone no:");
		double no = sc.nextDouble();
		System.out.println("ur no is:"+no);
		
		sc.nextLine();
		System.out.println("enter address");
		String add = sc.nextLine();
		System.out.println("address:"+add);
		
		
		
		
	}
	
	

}
