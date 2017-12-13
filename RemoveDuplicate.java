import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] nums = {1,2,2,2,3};
		RemoveDuplicate ob = new RemoveDuplicate();
		int size = ob.removeDuplicates(nums);
		System.out.println(size);
	}
	public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		Set<Integer> setOfInt = new HashSet<Integer>();
		for(int i:nums) {
			setOfInt.add(i);
		}
		int size = setOfInt.size();
		return size;
    }
}
