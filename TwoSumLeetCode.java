import java.util.Arrays;

public class TwoSumLeetCode {
	public static void main(String[] args) {
		int[] nums = {3,5,3,6};
		
		for(int p = 0; p<nums.length;p++) {
			System.out.println(nums[p]);
		}
		int target = 6;
		TwoSumLeetCode o = new TwoSumLeetCode();
		int[] pair = o.getPairOfSum(nums, target);
		System.out.println(pair[0]);
		System.out.println(pair[1]);
	}
	public int[] getPairOfSum(int[] nums, int target) {
		int[] pair = new int[2];
		Arrays.sort(nums);
		int j = nums.length-1;
		System.out.println(j);
		int a = 0,i = 0;
		while(i<nums.length) {
			System.out.println(nums[i]+" "+nums[j]);
			//System.out.println(nums[j]);
			int k = nums[i]+nums[j];
			if(k > target) {
				if(nums[i] > target) {
					if(nums[j] > target || nums[j] == target) {
						i++;j--;
					}
					else if(nums[j] < target) {
						i++;
					}
				}
				else if(nums[i] < target) {
					if(nums[j] > target || nums[j] == target) {
						j--;
					}
					else if(nums[j] < target && nums[j] > nums[i]) {
						j--;
					}
				}
				
			}	
			else if(k < target) {
				j--;
				i++;
				continue;
			}
			else {
				pair[0] = i;
				pair[1] = j;
				break;
			}
			
		}
		return pair;
	}
}
