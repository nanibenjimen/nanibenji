package javapractice;

public class Amstrong {
	
	public static void main(String[]args) {
		
		int num=1632;
		double ans=0;
		int count=0;
		
		int n=num;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		num=n;
		int ams = 0;
		while(num>0) {
			int rem=num%10;
			Object math;
			num=num/10;
		}
		if(n==ams) {
			System.out.println(n + "is a amstrong number");
		}
		else {
			System.out.println(n + "is not a amstrong number");
				}
	}

} 
