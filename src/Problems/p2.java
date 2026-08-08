package Problems;

public class p2 {
public static void main(String[] args) {
String	s1 = "you are living in hyderabad";
		String	s2 = "hyderabad";
		
   char [] text=s1.toCharArray();
   char [] search=s2.toCharArray();
   boolean found =false;
   for(int i=0;i<=text.length-search.length;i++) {
	   
	   int j;
	   
	   for(j=0;j<search.length;j++) {
		   System.out.println(j);

	    if(text[i+j]!=search[j]) {
	    	break;
	    	
	    }
   }

	   
	   
	   if(j==search.length) {
		   found=true;
		   break;
	   }
   }

  if (found)
      System.out.println("String Present");
  else
      System.out.println("String Not Present");
}
}