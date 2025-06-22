package example;
import java.util.*;
public class CountOfVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(count(s));
	}
		public static int count(String s) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'|| s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
					count++;	
			
		}
return count;
	}

}
