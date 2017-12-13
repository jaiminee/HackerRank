
public class OddNumber {
	public static void main(String[] args) {
		int l = 3, r=9;
		int[] arr = oddNumbers(3,9);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}
	public static int[] oddNumbers(int l, int r) {
		int i=l,j=0;
        int[] odd = new int[r-l+1];
        while(i>=l && i<=r){
            if(i%2 !=0){
                odd[j] = i;
            }
            i++;
            j++;
        }
        return odd;
	}
}
