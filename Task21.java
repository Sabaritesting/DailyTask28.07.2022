package Task1;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("First Number");
int a=sc.nextInt();
System.out.println("Second Number");
int b=sc.nextInt();
System.out.println("Third Number");
int c=sc.nextInt();
System.out.println("Fourth Number");
int d=sc.nextInt();
if(a==b&&b==c&&c==d) {
	System.out.println("Numbers are Equal");
}
else{
	System.out.println("Numbers are not Equal");
}

	}

}
