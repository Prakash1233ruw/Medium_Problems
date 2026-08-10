package Problems;

public class PrimeNumberPlusone {
public static void main(String[] args) {
	int a[]= {7, 4,1,2, 7, 23, 10 };
	
	for(int i=0;i<a.length;i++) {
	int n=a[i]+1;
	boolean isprime=true;
	for(int j=2;j<=n/2;j++) {
	if(n%j==0) {
		isprime=false;
		break;
	}
	}

	if(isprime) {
		System.out.println(a[i]);
	}
	}
	}

}
