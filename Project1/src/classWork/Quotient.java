package classWork;

import java.io.IOException;

public class Quotient {
	
	public static void method1() {
		method2();
	}
	public static void method2() throws Exception{
		throw new Exception("New info from exception 2");
	}
	}
