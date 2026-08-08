package Problems;

public class SerachingProblem4 {
public static void main(String[] args) {
	
	int [] a= {1,0,5,0,3,6};
	int index=0;
int non[]=new int[a.length];
for(int i=0;i<a.length;i++) {
	if(a[i]!=0) {
		non[index++]=a[i];
		
	}
		
}
while(index>a.length) {
	non[index]=0;
	index++;
}
for(int i:non) {
	System.out.println(i);

}
	
	
//	for(int i=0;i<arr.length-2;i++) {
//		
//			if(arr[i]+arr[i+1]+arr[i+2]==target) {
//				System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
//			}
//		}
//	}

}
}
