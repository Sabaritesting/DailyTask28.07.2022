package Task1;

import java.util.Scanner;

public class Task40 {

	public static void main(String[] args, int s) {
		// TODO Auto-generated method stub
		   int a,b,c = 0,d,e;
		   System.out.print ("Input number of rows : ");
		   Scanner sc = new Scanner(System.in);
				   int c1=sc.nextInt();

		   d=c+4-1;
		    for(a=1;a<=c;a++)
		   {
		   for(e=d;e!=0;e--)
		    {
		   System.out.print(" ");
		    }
		    for(b=1;b<=a;b++)
		    {
		     System.out.print(a+" ");
		     }
			System.out.println();
		    d--;
		   }

	}

}
