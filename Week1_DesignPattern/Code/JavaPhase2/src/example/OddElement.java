package example;
import java.util.*;
public class OddElement {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(oldElem(arr));
}
public static int oldElem(int [] arr1) {
	int sum=0;
	for(int i=0;i<arr1.length;i++) {	

		if(arr1[i]%2!=0) {
		sum+=arr1[i];
	}	
	}
     return sum;
}
}
