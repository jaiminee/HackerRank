
public class NoOfSubArrayWithProductLessThanK {
	public static void main(String[] args) {
		int[] arr = {5,3,2};
		int count = getNoOfSubArray(arr,10);
		System.out.println(count);
	}
	public static int getNoOfSubArray(int[] arr, int k) {
		//sliding window approach O(N)
		if(k<=0) return 0;
		int p = 1,left=0,count=0;
		for(int right=0;right<arr.length;right++) {
			p *=arr[right];//change right boundary
			while(p>=k) p/=arr[left++];//change left boundary if product is greater than k
			count += right-left+1;
			
		}
		return count;
	}
}
