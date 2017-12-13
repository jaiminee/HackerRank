import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class SeconMostFrequentWord {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//int testCount = in.nextInt();
		String[] arrString = {"a","b","b","d","d","d"};
		
		/*for(int i =0;i<arrString.length;i++) {
			if(!mapOfWordsToOccurence.containsKey(arrString[i])) {
				mapOfWordsToOccurence.put(arrString[i], 0);
			}
			else {
				
			}
			System.out.println(mapOfWordsToOccurence.get(arrString[i]));
		}*/
		String s = getString(arrString);
		System.out.println(s);
			
		
	}
	public static String getString(String[] arrString) {
		HashSet<String> mySet = new HashSet<String>(Arrays.asList(arrString));
		HashMap<String,Integer> mapOfWordsToOccurence = new HashMap<String,Integer>(mySet.size());
		int count=0;
		for(int i = 0;i<arrString.length;i++) {
			if(mapOfWordsToOccurence.containsKey(arrString[i])) {
				count++;
				mapOfWordsToOccurence.put(arrString[i], count);
			}
			else {
				count =1;
				mapOfWordsToOccurence.put(arrString[i], 1);
			}
			System.out.println("mapOfWordsToOccurence.get(arrString[i])"+mapOfWordsToOccurence.get(arrString[i]));
		}
		int max = 0;
		int min = 0;
		int secondMax = 0;
		System.out.println("mapOfWordsToOccurence.values()"+mapOfWordsToOccurence.values());
		for(Integer s:mapOfWordsToOccurence.values()) {
			
			if(s > max) {
				secondMax = max;
				max = s;
			}
			else if(s>secondMax && s!=max) {
				secondMax = s;
			}
			System.out.println("max"+max);
			
			System.out.println("secondMax"+secondMax);
			
		}
		//System.out.println(max);
		
		System.out.println(mapOfWordsToOccurence.keySet());
		for(String s:mapOfWordsToOccurence.keySet()) {
			System.out.println(mapOfWordsToOccurence.get(s));
			if(mapOfWordsToOccurence.get(s)==secondMax) {
				return s;
			}
			else {
				//return null;
			}
			
		}
		return null;
	}
}
