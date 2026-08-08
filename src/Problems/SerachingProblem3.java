package Problems;

public class SerachingProblem3 {
public static void main(String[] args) {
	
	int [] a= {10,20,50,40,30};
	int target =3;
	int firstLargest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;

	for(int i=0;i<a.length;i++) {
	if(a[i]>firstLargest) {
		secondLargest=firstLargest;
		firstLargest=a[i];	
	}else if(a[i]>secondLargest&& a[i]!=firstLargest) {
		secondLargest=a[i];
	}
		
}
	System.out.println(secondLargest);
	
	
//	for(int i=0;i<arr.length-2;i++) {
//		
//			if(arr[i]+arr[i+1]+arr[i+2]==target) {
//				System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
//			}
//		}
//	}

}
}
