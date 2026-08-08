package Problems;

public class p3 {
 public static void main(String[] args) {
	String s="apples";
	String s1="aeiou";
	int count =0;
	int count2=0;
	for(int i=0;i<s.length()/2;i++) {
		for(int j=0;j<s1.length();j++) {
			if(s.charAt(i)==s1.charAt(j)) {
				count++;
			}
		
		}
	}
	
	for(int i=s.length()/2;i<s.length();i++) {
		for(int j=0;j<s1.length();j++) {
			if(s.charAt(i)==s1.charAt(j)) {
				count2++;
			}
		
		}
	}
	if(count2==count)
	System.out.println("true");
	else
		System.out.println("false");
	}
}

