import java.util.HashMap;

public class TwoSumLeetCodeOptimal {
	public static void main(String[] args) {
		int[] nums = {3,5,3,6};
		
		
		int target = 6;
		TwoSumLeetCodeOptimal o = new TwoSumLeetCodeOptimal();
		int[] pair = o.getPairOfSum(nums, target);
		System.out.println(pair[0]);
		System.out.println(pair[1]);
	}
	public int[] getPairOfSum(int[] nums, int target) {
		HashMap<Integer, Integer> mapValuetoIndex = new HashMap<Integer, Integer>();
		int[] pair = new int[2];
		for(int i =0;i<nums.length;i++) {
			mapValuetoIndex.put(nums[i], i);
			System.out.println(mapValuetoIndex.get(nums[i]));
		}
		
		for(int i = 0;i<nums.length;i++) {
			int secondValue = target - nums[i];
			if(mapValuetoIndex.containsKey(secondValue) && mapValuetoIndex.get(secondValue)!=i) {
				pair = new int[] {i,mapValuetoIndex.get(secondValue)};
			}
			
		}
		return pair;
		
	}

}
