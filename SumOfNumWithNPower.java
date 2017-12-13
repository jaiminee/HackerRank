
public class SumOfNumWithNPower {
	public static void main(String[] args) {
		int X = 100;
		int count = getCountOfWay(X,2,1);
		System.out.println(count);
	}
	public static int getCountOfWay(int X, int power, int num) {
		int value = X- (int)Math.pow(num, power);
		if(value==0)
			return 1;
		else if(value <0)
			return 0;
		else {
			return getCountOfWay(value,power,num+1)+getCountOfWay(X,power,num+1);
			//first term to include current num, second dont include it and go to next term
		}
	}
}
