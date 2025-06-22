package example;
import java.io.*;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Text");
String s=sc.nextLine();
System.out.println(palindrome(s));
	}
	public static boolean palindrome(String s) {              
		s=s.toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){
				s1=ch+s1;
				int left=0;
				int right=s1.length()-1;
				while(left>right) {
					if(s1.charAt(left)!=s1.charAt(right)) {
						return false;
					}
					left++;
					right--;
					}
			}
		}
		System.out.println(s1);
		return true;
	}
}
