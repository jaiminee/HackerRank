

import java.util.Scanner;

public class HackerRank2 {
	public static void main(String[] args) throws Exception{
		
			Scanner s = new Scanner(System.in);
			//int n1 = s.nextInt();
			int n2 = s.nextInt();
			int d = n2/2;
			int x = 1;
			boolean flag = true;// starts from louise
			while(d != 1){
				System.out.println("hello");
				if(d%2 != 0){
					flag = true;	
					while((Math.pow(2, x)) < n2){
						x++;
					}
					x =x -1;	
					n2 = (int) (n2 - Math.pow(2, x));
				}
				else{
					flag = false;
					n2 = n2/2;
				}
				d= d/2;
				System.out.println("n2"+d);
			}
			System.out.println("n2"+n2);
			System.out.println("n2"+flag);
			if(n2==1){
				if(flag == false){
					
					System.out.println("Richard");
				}
				else{
					System.out.println("Louise");
				}
			}
		
		s.close();
	}
}
