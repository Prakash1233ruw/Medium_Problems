package Problems;

public class p5 {
 public static void main(String[] args) {
	int a[]=  {33, 88, 423, 121, 2382, 10};
	int fs=Integer.MAX_VALUE;
	int ss=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]<fs) {
			ss=fs;
			fs=a[i];
		}else if(a[i]>ss&& a[i]!=fs) {
			ss=a[i];
		}
	}
	System.out.println(ss);
 }
	

}

