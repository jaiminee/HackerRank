
public class CompareTwoArraySimilarity {
	public static void main(String[] args) {
		int[] a= {1, 2, 5, 4};
		int[] b= {2, 4, 5, 1};
		int result = findSimilarity(a,b);
		System.out.println(result);
	}
	public static int findSimilarity(int[] a, int[] b) {
		int total1=0,total2=0;
		for(int i=0;i<a.length;i++) {
			total1 +=a[i];
		}
		for(int i=0;i<b.length;i++) {
			total2 =total2 + total1/a[i] + total1%a[i];
		}
		if(total1==total2) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
