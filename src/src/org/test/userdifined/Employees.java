package org.test.userdifined;

public class Employees {
	public static void main(String[] args) {
		String empId = "124354";
		if (empId.startsWith("12")) {
			System.out.println("Unit 1 employees");
		} else {
			try {
				throw new EmployeeNotFountException();
			} catch (EmployeeNotFountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("database close");
			}
		}
		
	}

}
