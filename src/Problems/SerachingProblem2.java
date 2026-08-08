package Problems;

public class SerachingProblem2 {
public static void main(String[] args) {
	
	int [] arr= {1,0,1,1,0};
	int target =3;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
			if(arr[i]+arr[j]+arr[k]==target) {
				System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
			}
		}
	}
}
}
	
//	for(int i=0;i<arr.length-2;i++) {
//		
//			if(arr[i]+arr[i+1]+arr[i+2]==target) {
//				System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
//			}
//		}
//	}

}
