package example;

public class VowelREv {

	public static void main(String[] args) {
	  String s = "icecream";
	  char ch[] = s.toCharArray();
	  StringBuilder str = new StringBuilder(s);
	  String vowel ="AEIOUaeiou";
	  int i =0,j=s.length()-1;
	  while(i<j)
	  {
		  if(vowel.indexOf((ch[i]!=-1 && vowel.indexOf(ch[i])!=-1 )
		  {
			  char chr = s.charAt(i);
			  ch[i]=ch[j];
			  ch[j]=chr;
			  i++;
			  j--;
		  }
		  else if(vowel.indexOf(s.charAt(i))==-1)
		  {
			  i--;
		  }
		  else
		  {
			  j++;
		  }
	  }
	  
	
	for(char c : ch)
	{
		System.out.print(c);
	}
	}
}
