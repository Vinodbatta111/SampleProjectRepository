package samplepackage;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371,remainder=0;
		 long arm=0;
		long quotient=0;
		/*while(num!=0) {
			//quotient=quotient+Math.pow(remainder,3);
			quotient=num/10;
			remainder=num%10;
			num=remainder;
			arm=(long) (arm+Math.pow(quotient, 3));
			//System.out.println(quotient);
			//System.out.println("\n");
			if(remainder==0 || remainder<10)
				System.out.println(arm);
				break;
		}*/
		System.out.println(num/10);
		System.out.println(num%10);
		

	}

}
