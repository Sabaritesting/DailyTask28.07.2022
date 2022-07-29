package Task1;

import java.util.Scanner;

public class Task23 {
	public static String reverse_str_word(String input_sentence) {
	    if (input_sentence == null) {
	      throw new IllegalArgumentException("Input param can't be null.");
	    }
	    StringBuilder stringBuilder = new StringBuilder();
	    String[] words = input_sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	      stringBuilder.append(words[i]);
	      if (i != 0) {
	        stringBuilder.append(" ");
	      }
	    }
	    return stringBuilder.toString();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Type a sentence");
String input=Scanner.nextLine();
System.out.println("\nResult: " + reverse_str_word(input));		
	}
	}


