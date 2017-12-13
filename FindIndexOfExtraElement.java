
public class FindIndexOfExtraElement {
	public static void main(String[] args) {
		int[] a= {2,4,6,8,9,10,12};
		int[] b= {2,4,6,8,10,12};
		int index = getIndextOfExtraElement(a,b);
		System.out.println(index);
	}
	public static int getIndextOfExtraElement(int[] a, int[] b) {
		int sumA=0, sumB=0;
		for(int i =0;i<a.length;i++) {
			sumA +=a[i];
		}
		for(int i =0;i<b.length;i++) {
			sumB +=b[i];
		}
		int elem = sumA - sumB;
		int l=0,r=a.length-1;
		int indexOfElem = getIndexBinarySearch(elem, a, l, r);
		return indexOfElem;
		
	}
	public static int getIndexBinarySearch(int elem, int[] a, int l, int r) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			if(elem ==a[mid]) {
				return mid;
			}
			else if(elem < a[mid]) {
				return getIndexBinarySearch(elem, a, l, mid-1);
			}
			else {
				return getIndexBinarySearch(elem, a, mid+1, r);
			}
		}
		return -1;
	}
}
