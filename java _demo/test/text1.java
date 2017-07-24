package text;

import java.util.Arrays;

public class text1 {
	public static void main(String[] args) {
		//输出指定数组元素值的下标
		int[] numbers = new int[] {2,4,5,1,3};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers,5));
	}

}
