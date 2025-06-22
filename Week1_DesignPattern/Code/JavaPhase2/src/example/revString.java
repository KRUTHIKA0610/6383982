package example;
import java.util.*;
public class revString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(rev(s));
	}
public static String rev(String s) {
	String rev="";
	for(int i=0;i<s.length();i++) {
		rev=s.charAt(i)+rev;
	}
	return rev;
}
}
