package Problems;

public class ArmstrongNumber {

	    public static void main(String[] args) {
	       
	int n=153;
	int original=n;
	int count=0;
	int armSum=0;
	while (n>0){
	           count++;
	           n=n/10;
	       }
	       
	           n=original;

	while (n>0){
	           int rem=n%10;
	          armSum=armSum+(int)Math.pow(rem, count);
	           n=n/10;
	       }
	  
	       System.out.println(armSum);
	       if(armSum==original)
	       {
	             System.out.println(armSum+" is an armstrong number");
	        }else{
	        System.out.println(     original+" is not an  armstrong number");
	        
	        }
	    }
	}
