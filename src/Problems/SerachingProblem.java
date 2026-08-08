package Problems;

public class SerachingProblem {
public static void main(String[] args) {
	
	int [] arr= {1,3,2,2,7};
	int target =4;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}
//	for(int i=0;i<arr.length-1;i++) {
//		
//			if(arr[i]+arr[i+1]==target) {
//				System.out.println(arr[i]+" "+arr[i+1]);
//			}
//		}
//	}

}
