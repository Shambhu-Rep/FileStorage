package org.test.userdifined;

public class EmployeeNotFountException extends Throwable {
	@Override
	public String getMessage() {
		String msg="Employee not fount in unot 1";
		return msg;
	}

}
