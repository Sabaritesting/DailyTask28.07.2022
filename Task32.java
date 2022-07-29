package Task1;

public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1,b=0,c=0;
while(b<100) {
	c++;
	if(c%2!=0) {
		if(is_Prime(c)) {
			a+=c;
		}
	}
	b++;
}
System.out.println("Sum of prime numbers upto 100 is :"+a);
	}

	private static boolean is_Prime(int c) {
		// TODO Auto-generated method stub
		for (int i = 3; i * i <= c; i+= 2) {
			if (c % i == 0) {
				return false; 
			}
		}
		return true;
	}

}
