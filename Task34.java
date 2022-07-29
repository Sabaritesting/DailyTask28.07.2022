package Task1;

import java.util.Arrays;

public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {20,30,40};
System.out.println("Original Array:"+Arrays.toString(a));
int[] array_nums = null;
int x = array_nums[0];
array_nums[0] = array_nums[array_nums.length-1];
array_nums[array_nums.length-1] = x;
System.out.println("The array after swapping:"+Arrays.toString(array_nums));
	}

}
