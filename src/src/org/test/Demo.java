package org.test;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("1");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("2");
		System.out.println(5);
		//Null pointer Exception
		Thread.sleep(1000);
		String s1=null;
		try {
			System.out.println(s1.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.err.println(12);
		}
		//Number format Exception
		Thread.sleep(1000);
		String s="qwwe";
		int n = Integer.parseInt(s);
		System.out.println(n);
		
		

	}

}
