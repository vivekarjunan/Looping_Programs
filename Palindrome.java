package practice_project;

public class Palindrome {

	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		
		p.add(1221);
	}

	private void add(int no) {

       int rev = 0;
       int no1 = no;
       while(no>0)
       {
    	   rev = rev*10+no%10;
    	   no = no/10;
       }
       //System.out.println(rev);
       
       if(no1==rev)
         System.out.println(no1+ "no is palindrome");	
       else
    	 System.out.println(no1+ "no is not palindrome");  
	}

}
