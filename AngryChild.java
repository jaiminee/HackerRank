import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChild {
	public static void main(String[] args) throws NumberFormatException, IOException{

	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(in.readLine());
	      int K = Integer.parseInt(in.readLine());
	      int[] list = new int[N];

	      for(int i = 0; i < N; i ++)
	         list[i] = Integer.parseInt(in.readLine());
	      
	      Arrays.sort(list);
	      int max = list[0];
    	  int min = list[0];
	      for(int i =1;i<K;i++) {
	    	 
	    	  if(list[i]>max) {
	    		  max = list[i];
	    	  }
	    	  else if(list[i]< min) {
	    		  min = list[i];
	    	  }
	    	  else {
	    		  continue;
	    	  }
	      }
	      int unfairness = max - min; 
	      System.out.println(unfairness);
	}
	      
}
