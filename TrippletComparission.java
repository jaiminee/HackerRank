import java.util.ArrayList;
import java.util.Arrays;

public class TrippletComparission {
	public static void main(String[] args) throws Exception {
		int[] a = {5,6,7};
		int[] b = {3,6,10};
		ArrayList<Integer> listAlice = new ArrayList<Integer>();
		ArrayList<Integer> listBob = new ArrayList<Integer>();
		for(int i = 0;i<a.length;i++) {
			listAlice.add(a[i]);
			//System.out.println(listAlice.get(i));
			listBob.add(b[i]);
			//System.out.println(listBob.get(i));
		}
		TrippletComparission ob = new TrippletComparission();
		int[] result = ob.solve(listAlice, listBob);
		for(int i = 0; i<result.length;i++) {
			if(result[i]==1) {
				System.out.print(result[i]+" ");
			}
		}
		
	}
	public int[] solve(ArrayList<Integer> listAlice, ArrayList<Integer> listBob) {
		int[] listResult = new int[listAlice.size()];
		for(int i = 0; i<listAlice.size();i++) {
			if(listAlice.get(i) > listBob.get(i)) {
				listResult[i]=1;
			}
			else if(listAlice.get(i) < listBob.get(i)) {
				listResult[i]=1;
			}
			else {
				listResult[i]=0;
			}
		}
		return listResult;
	}
}
