
public class Solution1 {
	public static void main(String[] args) {
		long count = getCount(2);
	}
	public static long getCount(int n) {
		
		int[] arr = {1,2,3}	;
		int i=0;
		long count = countCompositions(arr, n);
		return count;
	}
	public static long countCompositions(int[] nums, int target) {
		/*long count =0;
		int MAX_POINT = 3;
		if (n == 0)
        {
            count++;
        }
        else if(n > 0)
        {
            for (int k = 1; k <= MAX_POINT; k++)
            {
                arr[i]= k;
                count = countCompositions(arr, n-k, i+1);
            }
        }
		System.out.println(count);
		return count;*/
		 if (target == 0) {
		        return 1;
		    }
		    int res = 0;
		    for (int i = 0; i < nums.length; i++) {
		    	System.out.println("I:" +i);
		           
		    	if (target >= nums[i]) {
		        	System.out.println("resin"+res);
		            res += countCompositions(nums, target - nums[i]);
		            System.out.println("resout"+res);
		            System.out.println("target - nums[i]"+(target - nums[i]));
		        }
		    }
		    //System.out.println(res);
		    return res;
	}
}
