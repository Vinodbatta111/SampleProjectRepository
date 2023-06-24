package samplepackage;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("abcdefacbcde");
	    int i,count=1,j;
	    for(i=0;i<str.length();i++){
	    for(j=0;j<str.length();j++){
	    	
	    if(i!=j && str.charAt(i)==str.charAt(j)){
	    count++;
	    }
	    if(j==str.length()-1)
	     System.out.println(str.charAt(i)+"="+count);
	    
	  }
	  count=1;
	  }
	}

}
