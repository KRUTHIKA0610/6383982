package example;

import java.io.*;
import java.util.Scanner;

public class ReturnLast {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int count=0;
for(int i=s1.length();i<=0;i--){
	s1.charAt(i);
/*if(s1.charAt(i)=" ") {
	break;
}
else {
	count++;
}
}*/
System.out.println(i);
}
}
}