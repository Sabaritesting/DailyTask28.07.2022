package Task1;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Javapoint Tutorial";
String name1="Javapoint Tutorial";
int result=name.compareTo(name1);
if(result<0) {
	System.out.println("Uncommon");
}
else if(result==0) {
	System.out.println("Common:"+name+name1);
}
else if(result>0) {
	System.out.println("Infinite Common");
}
	}

}
