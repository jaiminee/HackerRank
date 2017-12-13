import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,10};
		int k =10;
		int size = arr.length-1;
		Arrays.sort(arr);
		int n = getNumberThruBinarySearch(arr, 0, size,k);
		if(n==-1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
			System.out.println(n);
		}
	}
	public static int getNumberThruBinarySearch(int[] arr, int l, int r, int k) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			System.out.println(mid);
			if(arr[mid]==k) {
				System.out.println("1if"+mid);
				return mid;
			}
			if(arr[mid]>k) {
				//System.out.println("2if"+getNumberThruBinarySearch(arr, l, mid-1,k));
				return getNumberThruBinarySearch(arr, l, mid-1,k);
			}
			
				//System.out.println("3if"+getNumberThruBinarySearch(arr, mid+1,r,k));
				return getNumberThruBinarySearch(arr, mid+1,r,k);
			
		}
		
		return -1;
		
	}
}
