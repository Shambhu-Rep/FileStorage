package org.test;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String s="hello";
			System.out.println(s);
			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("I am inner finally block");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am outer finally block");
		}
		
	}

}
