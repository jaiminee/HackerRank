import java.util.Scanner;

public class PointsOnLine {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] x = new int[n];
	        int[] y = new int[n];
	        for(int a0 = 0; a0 < n; a0++){
	            x[a0]= in.nextInt();
	            y[a0] = in.nextInt();
	        }
	        boolean flagX = false;
	        boolean flagY = false;
	        for(int a0 = 0; a0 < n; a0++){
	        	if(a0 == (n-1)) {
	        		   break;
	           }
	           if(x[a0] == x[a0+1]) {
	        	   flagX = true;
	           }
	           else {
	        	   flagX = false;
	        	   break;
	           }
	        }
	        for(int a0 = 0; a0 < n; a0++){
	        	if(a0 == (n-1)) {
	        		   break;
	           }
	           if(y[a0] == y[a0+1]) {
	        	   flagY = true;
	           }
	           else {
	        	   flagY = false;
	        	   break;
	           }
	        }
	        if(flagX == true || flagY == true) {
	        	System.out.println("Yes");
	        }
	        else {
	        	System.out.println("No");
	        }
	    }
}
