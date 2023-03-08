package ua.com.foxminded.helloworld;

public class HelloWrold {

	public static void main(String[] args) {
		String message = "Hello World!";
		int i = 42;
		int n = 6;
		int j = 7;
		double d = 2.5;
		int hugeNumber = 521124244;
		
		int moduleAns = hugeNumber % i;
		int answer = n * j;
		float floatAnswer = (float)n / (float)j; // made them float temporary or we could int -> float
		double ans = (i + j * d);
		String stringAnswer = message + " " + answer; 
		
		boolean isMoreThanOne; // is false by default
		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}
		
		boolean evenNumber;
		if (i % 2 == 0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}
		
		boolean evenNumber_2;
		if (j % 2 == 0) {
			evenNumber_2 = true;
		} else {
			evenNumber_2 = false;
		}
		
		
		System.out.println(message); /* sysout = ctrl + space */
		System.out.println("i " + i + " " + evenNumber);
		System.out.println("j " + j + " " + evenNumber_2);
		System.out.println(answer + " " + isMoreThanOne);
		System.out.println(stringAnswer);
		System.out.println(floatAnswer);
		System.out.println(ans);
		System.out.println(moduleAns);
	}

}
