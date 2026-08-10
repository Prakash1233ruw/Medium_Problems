package Problems;

public class SumOfDuplicateNum {

	public static void main(String[] args) {
		int count[]=new int[10];
		int n=234234;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			count[rem]++;
			n=n/10;
		}

//		for(int i:count) {
//			System.out.println(i);
//		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>1) {
				sum=sum+i;

			}
		}
		
		System.out.println(sum);


	}
}


//int num =7473183;
//int original=num;
//int size=0;
//int count=0;
//int sum=0;
//while(num>0) {
//	size++;
//	num=num/10;
//}
//int a[]=new int[size];
//while(original>0) {
//int rem=original%10;
//a[count++]=rem;
//original=original/10;
//}
//
//for(int i=0;i<a.length;i++) {
//for(int j=i+1;j<a.length;j++) {
//if(a[i]==a[j]) {
//	sum=sum+a[j];
//}
//}
//}
//System.out.println(sum);
//}
//
//}