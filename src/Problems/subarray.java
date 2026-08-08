package Problems;

public class subarray {
public static void main(String[] args) {
	
	int [] a= {5,9,1,8,7,8};int n=a.length;
	int sl=3;
    int count=0;
    for(int i=0;i<n-sl+1;i++) {
    	int j=i+sl-1;
    	int temp=0;
    	for(int k=i;k<=j;k++) {
			temp+=a[k];
			
		}
    	count=	Math.max(count, temp);

    	}
  System.out.println(count);

    		
    }
   


//for(int i=0;i<n;i++) {
//	for(int j=i;j<n;j++) {
//		int sum=0;
//		for(int k=i;k<=j;k++) {
//			sum+=a[k];
//			
//		}
//		
//
//count=	Math.max(count, sum);
//	
//		
//		
//	}
//		
//}
//System.out.println(count);
//

}

