package Problems;

public class Problem2 {
public static void main(String[] args) {
	int num=150932;
	int min=9;
	int max=0;
	

	while(num>0) {
	int rem=num%10;
	if(rem>max) {
		max=rem;
	}
	if(rem<min) {
		min=rem;
	}
	
	num=num/10;
	
	}
	System.out.println(max);
	System.out.println(min);
	
}
}