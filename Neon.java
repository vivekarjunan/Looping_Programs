package practice_project;

public class Neon {

	public static void main(String[] args) {

		int neon = 9;
		int no1 = 0;
		int no = neon*neon;
		while(no>0)
		{
	    
		no1= no1+no%10;
		no =no/10;
		
		
		
		}
	    if(neon==no1)
		
		System.out.println(no1+  " is neon number");
	    
	    else
	     System.out.println(no1+ " is not neon number");	
	}

}
