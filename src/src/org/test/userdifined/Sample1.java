package org.test.userdifined;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee Id : ");
		String id=sc.next();
		if(id.startsWith("12")) {
			System.out.println("Unot 1 employees");
		}
		else {
			try {
				throw new EmployeeNotFountException();
			} catch (EmployeeNotFountException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Data base close");
			}
			
		}
	}

}
