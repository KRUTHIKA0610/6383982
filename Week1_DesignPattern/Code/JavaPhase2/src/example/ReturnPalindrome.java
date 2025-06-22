package example;
import java.util.*;
public class ReturnPalindrome {
	public static void main(String [] args) {	
Scanner sc=new Scanner(System.in);
System.out.println("Enter text");
int s=sc.nextInt();
int arr[]=new int[s];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));
}
}