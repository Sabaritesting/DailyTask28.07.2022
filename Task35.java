package Task1;

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a positive Integer");
int a1 = sc.nextInt();
System.out.printf("Is %d is a palindrome number?\n",a1);
System.out.println(is_Palindrome(a1));
}

public static int reverse_nums(int n) {
int reverse = 0;
while (n != 0) {
    reverse *= 10;
    reverse += n % 10;
    n /= 10;
}
return reverse;
	}
public static boolean is_Palindrome(int a) {
    return (a == reverse_nums(a));
}

}
