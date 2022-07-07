package org.test.retry;

public class Company {
	private int getId() {
		int a=10;
		if(a==10) {
			return 20;
		}
		return 100;
	}
	public static void main(String[] args) {
		Company c=new Company();
		int id = c.getId();
		System.out.println(id);
	}

}
