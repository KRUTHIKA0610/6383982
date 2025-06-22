package example;

import java.util.Scanner;

public class SecMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println(SecMax(a));
}
	public static int SecMax(int [] arr) {
		int max=arr[0];
for(int i=1;i<arr.length;i++) {
	if(max<arr[i]) {
		int secMax=max;
		max=arr[i];
	}
	else if()
}
	}

}
