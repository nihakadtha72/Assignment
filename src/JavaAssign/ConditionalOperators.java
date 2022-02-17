package JavaAssign;

public class ConditionalOperators {

	public static void main(String[] args) {

		byte b = 065;
		System.out.println(b);

		int a = 10;
		int c = 20;

		System.out.println(a == c);

		if (a == b) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
		if (false) {
			System.out.println("HI");
		} else {
			System.out.println("BYE");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("UTF");
		}

		double d1 = 12.33;
		double d2 = 12.34;
		if (d1 == d2) {
			System.out.println("both are eq");
		} else {
			System.out.println("both r not eq");
		}

		String s1 = "Hello";
		String s2 = "hello";
		if (s1.equals(s2)) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("EQQQQQQQQQ");
		}
		
		
	
		
		String browser="ie";
		
		switch(browser.toLowerCase().trim().replace(" ", "")){
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "opera":
			System.out.println("launch opera");
			break;
		 default :
			 System.out.println("Please pass the right browser");
		break;
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

