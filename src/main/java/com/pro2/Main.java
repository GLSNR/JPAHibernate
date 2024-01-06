package com.pro2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.AddEmployee\n2.EditEmployee\n3.ManagerHirarichy\n4.Exit");
		int n=sc.nextInt();
		
			switch(n)
			{
				case 1: AddEmployee aD= new AddEmployee();
						aD.addEmp();
						break;
				default: System.out.println("Invalid Choose");
						break;
			}
		
		
	}

}
