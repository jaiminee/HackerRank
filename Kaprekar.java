
public class Kaprekar {
	public static void main(String[] args) throws Exception{
		int l = 1;
		int h = 100;
		Kaprekar ob = new Kaprekar();
		int[] result = ob.getkaprekarNumber(l, h);
		
		for(int i = 0;i<result.length;i++) {
			if(result[i] !=0) {
				System.out.print(result[i]+" ");
			}
			else {
				break;
			}
		
		}
		
	}
	public int[] getkaprekarNumber(int l, int h) {
		int i=l+1,j=0,square,cSdigit=0,cDigit=0,sC1=0,sC2=0,s1=0,s2=0,sCs=0;
		String s =null,tempS="";
		StringBuilder sb;
		int[] result = new int[h/2];
		while(i>=l && i<h) {
			double doublei = (double)i;
			square = (int)Math.pow(doublei, 2);
			System.out.println(square);
			while(square > 0) {
				Integer num = square % 10;
				System.out.println(num);
				s = num.toString();
				s = tempS + s;
				tempS= s;
				System.out.println("concat"+s);
				/*sb = new StringBuilder(s);
				System.out.println(sb);
				s = sb.append(s).toString();
				System.out.println(s);*/
				square = square/10;
				cSdigit++;
			}
			System.out.println("cSdigit"+cSdigit);
			int var = i;
			while(var>0) {
			int temp = var % 10;
			var = var/10;
			cDigit++;
		}
			System.out.println("cDigit"+cDigit);
			if(cDigit == 1) {
				if(cSdigit == 1) {
					char cS = s.charAt(0);
					sCs = Character.getNumericValue(cS);
				}
				else {
					char c1 = s.charAt(0);
					sC1 = Character.getNumericValue(c1);
					System.out.println("sC1"+sC1);
					char c2 = s.charAt(1);
					sC2 = Character.getNumericValue(c2);
					System.out.println("sC2"+sC2);
				}
				
				
			
			}
			else {
			
				System.out.println("StringBuilder(s.substring(0, cDigit-1))"+ new StringBuilder(s.substring(0, cDigit)));
				s1  = Integer.parseInt(new StringBuilder(s.substring(0, cDigit)).reverse().toString());
				
				s2  = Integer.parseInt(new StringBuilder(s.substring(cDigit, s.length())).reverse().toString());
		
				
			}
			System.out.println("i"+i);
			System.out.println("(s1+s2)"+(s1+s2));
			System.out.println("(sC1+sC2)"+(sC1+sC2));
		if((i==(s1+s2)) ||(i==(sC1+sC2)) || (i==sCs) ) {
			System.out.println("(i==(sC1+sC2)"+(i==(sC1+sC2)));
			System.out.println("(i==(s1+s2)"+(i==(s1+s2)));
			result[j] = i;
			j++;
			System.out.println("result[j]"+result[j]);
			
		}
		else {
			//continue;
			
		}
		s = null;
		tempS = "";
		cDigit = 0;
		cSdigit = 0;
		i++;
		System.out.println("i"+i);
		
	}
		
		return result;
}

}