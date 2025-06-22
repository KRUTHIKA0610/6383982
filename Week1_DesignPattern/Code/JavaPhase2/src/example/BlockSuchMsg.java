package example;
import java.util.*;
public class BlockSuchMsg {
public static void main(String [] args){	
Scanner sc=new Scanner(System.in);
System.out.println("Enter Text");
String s=sc.next();
BlockSuchMsg msg=new BlockSuchMsg();
System.out.println(msg.block(s));
}
public  boolean block(String s){
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='') {
			return true;
		}
	}
	return false;
}
}
