import java.util.HashMap;

public class CountSubArrayWithSumEqualToK {
	public static void main(String[] args) {
		int[] arr = {5,3,2,4};
		int count = getNoOfSubArray(arr,9);
		System.out.println(count);
	}
	public static int getNoOfSubArray(int[] arr, int k) {
	//using HashMap
		HashMap<Integer,Integer> mapOfSumToOccurence = new HashMap<Integer,Integer>();
		int sum = 0,count=0;
		for(int i = 0;i<arr.length;i++) {
			mapOfSumToOccurence.put(sum, mapOfSumToOccurence.getOrDefault(sum,0)+1);
			sum +=arr[i];
			count +=mapOfSumToOccurence.getOrDefault((k-sum), 0);
			
		}
		return count;
	}	
			
}
