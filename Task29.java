package Task1;

public class Task29 {

	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
		System.out.println("\nDivided by 3: ");		
		for (int a=1; a<100; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int a=1; i<100; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int a=1; i<100; i++) {
			if (i%3==0 && i%5==0) System.out.print(i +", ");			
		}
		System.out.println("\n");
	}

}
