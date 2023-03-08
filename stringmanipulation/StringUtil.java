package ua.com.foxminded.stringmanipulation;

import java.util.Scanner;

public class StringUtil {

	public static void main(String[] args) {

		String source = "Hello my World!";
		
		String[] words = source.split(" "); // the array of the words
		// String[][] words2 = source.split(" ");

		System.out.println(words.length);
		System.out.println(words[0]);

		char[] letters1 = words[1].toCharArray();
		System.out.println(letters1.length);

		System.out.println();
		System.out.println("The length of the source is " + source.length());
		System.out.println();

		System.out.println("Words length = " + words.length);
		System.out.println();

		System.out.println();

		char[] letters2 = source.toCharArray();
		System.out.println(letters2.length);

		for (int i = 0; i < 1; i++) {
			System.out.println(source);
			System.out.println();

			for (int j = 0; j < letters2.length; j++) {
				System.out.println(source.charAt(j));
			}
		}
		System.out.println();

		for (int i = 0; i < words.length; i++) {

		//	System.out.println(words[i]);

			char[] letters = words[i].toCharArray();
			System.out.println(words[i] + " " + letters.length);

		}
		
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		String str1 = input1.nextLine();
		String[] sourceInput = str1.split(" ");
		
		System.out.println("You entered a string: " + str1);
		
		for (int i = 0; i < sourceInput.length; i++) {

			char[] letters = sourceInput[i].toCharArray();
			System.out.println(sourceInput[i] + " " + letters.length);
		}
		

//		Scanner input2 = new Scanner(System.in);
//		String str2 = input2.nextLine();
//		System.out.println("You entered string: " + str2);

	}

}
