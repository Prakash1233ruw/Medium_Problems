package Problems;

public class SecondDuplicateNum {

	public static void main(String[] args) {
int a[]= {64, 1, 2, 7, 79, 7, 7, 1, 22};
int duplicateCount = 0;

int index=0;
int aa[]=new int[2];
	 for(int i=0;i<a.length;i++) {
		 int count=0;
		 for(int j=0;j<a.length;j++) {
			 if(a[i]==a[j]) {
				count++;
			 }
		 }
		 
		 if(count>1) {
		        duplicateCount++;
		        if(duplicateCount == 2) {
		            System.out.println("Second duplicate number is " + a[i]
		                    + " and it is occurred " + count + " times");
		            break;
		        }
		 }
	 }
	 
	 for(int i:aa) {
		 System.out.println(i);
	 }

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