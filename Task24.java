package Task1;

import java.util.Scanner;

public class Task24 {
	public static boolean is_str_contains(String str1, String str2) {
	    if (str1 == null || str2 == null) {
	      throw new IllegalArgumentException("You can't pass null strings as input.");
	    }
	     boolean ans = false;
	     for (int i = 0; i < str2.length() - 1; i++) {
	       if (str2.charAt(i) == str1.charAt(0)) {
	         for (int j = 0; j < str1.length(); j++) {
	           if ((i + j) < str2.length() && str1.charAt(j) == str2.charAt(i + j) && j == str1.length() - 1) {
	             ans = true;
	             break;
	           }
	        }
	      }
	    }
	    return ans;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("First Sentence");
String take=sc.next();
System.out.println("Second Sentence");
String get=sc.next();
System.out.println("If the second string contains the first one?" is_str_contains(get,take));
	}

}
