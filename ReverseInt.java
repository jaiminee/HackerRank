
public class ReverseInt {
	public static void main(String[] args) {
		int x = -123;
		ReverseInt o1 = new ReverseInt();
		int j = o1.reverse(x);
		System.out.println(j);
	}
	public int reverse(int x) {
		ReverseInt o = new ReverseInt();
		String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer(s);
        if(x >0){
        	if(x<10) {
        		return x;
        	}
        	else {
        		int tempX = o.reverseTemp(x);
        		return tempX;
        	}
        }
        else{
            
            sb = new StringBuffer(sb.substring(1));
            System.out.println(sb.substring(1));
            System.out.println(s);
            s = "-"+sb.reverse().toString();
           
            System.out.println(s);
           
            
            int temp = Integer.parseInt(s);
            
            return temp;
        }
        
        
    }
	public int reverseTemp(int temp) {
		int tempOut=0;
		while(temp > 0) {
			tempOut = tempOut*10 + temp%10;
			System.out.println(tempOut);
			temp = temp/10;
			System.out.println(temp);
		}
		System.out.println(tempOut);
		return tempOut;
	}
}
