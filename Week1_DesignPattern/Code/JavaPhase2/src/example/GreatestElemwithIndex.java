package example;
import java.util.*;
public class GreatestElemwithIndex {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++) {
				 arr[i]=sc.nextInt();
			}
			System.out.println(oldElem(arr));
	}
		public static int oldElem(int [] arr1) {
			int k=0;
			int max=arr1[0];
			for(int i=1;i<arr1.length;i++) {
				if(arr1[i]>max ){
					 max=arr1[i];
					k=i;
				}
			}	
			return k;
			}  
	}

