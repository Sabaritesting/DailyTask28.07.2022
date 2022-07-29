package Task1;

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationWithRepeation("PQR");

	}

	private static void permutationWithRepeation(String name) {
		// TODO Auto-generated method stub
		System.out.println("The given String is: PQR");
		System.out.println("Thepermuted Strings are");
		showPermutation(name, "");
	}
	 private static void showPermutation(String str1, String NewStringToPrint) {

		  if (NewStringToPrint.length() == str1.length()) {
		   System.out.println(NewStringToPrint);
		   return;
		  }
		  for (int i = 0; i < str1.length(); i++) {

		   showPermutation(str1, NewStringToPrint + str1.charAt(i));
		  }
		 }
		}



