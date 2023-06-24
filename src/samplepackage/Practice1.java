package samplepackage;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sample program");
		String str="reverse";
		
		String newStr;
		System.out.println(str.charAt(0));
		char ch[]=new char[str.length()];
		for(int i=str.length()-1;i>=0;i--) {
			ch[i]=str.charAt(i);
			System.out.println(ch[i]);
			
		}
		//newStr=new String(ch.toString());
		//System.out.println(ch.toString());

	}
}