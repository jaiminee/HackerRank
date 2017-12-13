import java.util.Arrays;
import java.util.Scanner;

public class OneTwoThreeContains {
	public static void main(String[] args) {
		//int[] arr = {11,14,13,12};
		
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int[] countTest = new int[line];
		int[] countNo = new int[countTest.length];
		int[][] arr1 = new int[line][100];
		for(int j =0;j<countTest.length;j++) {
			countNo[j] = sc.nextInt();
			int[] arr = new int[countNo[j]];
			//System.out.println(countNo[j]);
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				arr1[j][i] = arr[i];
			}
			Arrays.sort(arr);
			
		}
		for(int j =0;j<countTest.length;j++) {
			int[] temp = new int[countNo[j]];
			for(int i=0;i<countNo[j];i++) {
				temp[i] = arr1[j][i];
				
			}
			int[] result = getNumbers(temp);
			if(result == null) {
				System.out.println("-1");
			}
			else {
				for(int k=0;k<result.length;k++) {
					if(result[k]!=0) {
						System.out.print(result[k]+" ");
					}
					
				}
			}
			System.out.println();
		}
		
		
	}
	public static int[] getNumbers(int[] arr) {
		int[] result = new int[arr.length];
		int j =0;
		Boolean flag =true;
		for(int i =0;i<arr.length;i++) {
			int n = arr[i];
			while(n>0) {
				
				int out = n % 10;
				if(out ==1 ||out ==2 ||out ==3) {
					result[j] = arr[i];
					//System.out.print(result[j]+" ");
					break;
				}
				n = n/10;
			}
			if(result[i]!=arr[i]) {
				flag = false;
			}
			flag = true;
			j++;
		}
		if(flag == false) {
			return null;
		}
		return result;
	}
}
