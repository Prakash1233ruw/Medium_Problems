package Problems;

public class Problem1 {
public static void main(String[] args) {
	int a=15;
	int b=25;
	
	int largest=0;
	
for(int i=a;i<=b;i++) {
	
	int sum=0;
	int num=i;
	while(num>0) {
	int rem=num%10;
	sum+=rem;
	num=num/10;
	
	}
	
	
if(sum>largest) {
	largest=sum;
}

	
}
System.out.println(largest);
}
}
