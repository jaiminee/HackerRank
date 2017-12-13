import java.util.Scanner;

public class RestaurantBreadSquare {
	static int lineCount = 0;
	public static void main(String[] args) {
		RestaurantBreadSquare ob = new RestaurantBreadSquare();
		Scanner sc = new Scanner(System.in);
		lineCount = sc.nextInt();
		int[] result = new int[lineCount];
		//int[] result1 = new int[lineCount];
		int j =0;
		
		for(int k = 0;k<lineCount;k++) {		
			int length = sc.nextInt();
			int width = sc.nextInt();
			result = ob.getNoOfSquares(result,j,length, width);
			
			j++;
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}
	public int[] getNoOfSquares(int[] result,int j, double l, double b) {
		double sqrtL = Math.sqrt(l);
		//System.out.println("sqrtL"+sqrtL);
		double sqrtB = Math.sqrt(b);
		//System.out.println("sqrtB"+sqrtB);
		int tempL = (int)sqrtL;
		//System.out.println("tempL"+tempL);
		int tempB = (int)sqrtB;
		//System.out.println("tempB"+tempB);
		int countSqr = 0;
		//int[] result = new int[lineCount];
		//System.out.println("(sqrtL-tempL)"+(sqrtL-tempL));
		//System.out.println("(sqrtB-tempB)"+(sqrtB-tempB));
		if((sqrtL-tempL)==0 ||(sqrtB-tempB)==0) {
			if((sqrtB-tempB)==0 && (sqrtL-tempL)==0) {
				countSqr = 2;
				
			}
			else if((sqrtB-tempB)!=0) {
				countSqr = (int)b;
			}
			else if((sqrtL-tempL)!=0) {
				countSqr = (int)l;
			}
			else {
				return null;
			}
		}
		else if((sqrtL-tempL)!=0 ||(sqrtB-tempB)!=0){
			countSqr = 1;
		}
		else {
			return null;
		}
		result[j] = countSqr;
		//System.out.println("result[j]"+result[j]);
		
		
		return result;
	}
}
