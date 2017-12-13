
public class ArrayContainsInt {
	public static void main(String[] args) {
		int[] arr = {5,2,3,4,5};
		int k =1;
		String s = findNumber(arr,1);
		System.out.println(s);
	}
	public static String findNumber(int[] arr, int k) {
       
        Boolean flag = true;
        Boolean repeat = false;
        String s = "";
        for(int i =0;i<arr.length;i++){
            if(arr[i]==k){
                flag = true;
                break;
               
            }
            flag = false;
            
        }    
        if(flag==true){
            s = "YES";
            return s;
        }
        else{
             s = "NO";
            return s;
        }

    }
}
