package Problems;

public class p4 {
 public static void main(String[] args) {
	int a[]=  {34, 88, 423, 121, 2382, 10};
	int count =0;
	int count2=0;
	for(int i=0;i<a.length;i++) {
		int last=a[i]%10;
	while(a[i]>10) {
	a[i]=a[i]/10;
	}
	int first=a[i];
	if(first==last) {
		count++;
	}
	
		}
	System.out.println(count);
	}
	

}

