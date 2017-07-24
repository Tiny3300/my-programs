package text;
//一个数组，让数组的每个元素去除第一个元素，得到的商作为被除数所在位置的新值。
public class T11 {

	public static void main(String[] args) {
		int[] arr = new int[]{12,43,65,45,88,64,22};
		
		for(int i= arr.length-1;i>=0;i--){
			arr[i] = arr[i]/arr[0];
		}
		for(int i=0;i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
