package practice_project;

public class Pattern_Program_AtoZ {

  public static void main(String[] args) {

	 Pattern_Program_AtoZ obj = new Pattern_Program_AtoZ();	
		
	 		//obj.pattern_A();
			//obj.pattern_B();
		    //obj.pattern_C();
			//obj.pattern_D();
			//obj.pattern_E();
			//obj.pattern_F();
			//obj.pattern_G();
			//obj.pattern_H();
			//obj.pattern_I();
			//obj.pattern_J();
			//obj.pattern_K();
			//obj.pattern_L();
			//obj.pattern_M();
			//obj.pattern_N();
		    //obj.pattern_O();
		    //obj.pattern_P();
		    //obj.pattern_Q();
		    //obj.pattern_R();
		    //obj.pattern_S();
		    //obj.pattern_T();
		    //obj.pattern_U();
		    //obj.pattern_V();
		    //obj.pattern_W();
			//obj.pattern_X();
		    //obj.pattern_Y();
		    //obj.pattern_Z();
	}
  
  private void pattern_A() {
	    int no=6;
	    int no1=4;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(col==no-row||col==no1+row||row==3&&col>3&&col<8) //A
				   System.out.print("* ");
				else
				   System.out.print("  ");	
				
			}
		
			System.out.println();

		}
		
		System.out.println("----------------------");

 }
  
  private void pattern_B() {

		for(int row=1;row<=10;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1&&col!=5||col==1||row==5||col==5&&row!=1&&row!=10||row==10&&col!=5)  //B
				  System.out.print("* ");	
				else
				  System.out.print("  "); 	
			}
			System.out.println();
		}
	   System.out.println("----------------------");

	}
  
  private void pattern_C() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==1||row==5)  //C
				  System.out.print("* ");
				else
				  System.out.print(" ");
				
			}	
			
			System.out.println();
		}
		System.out.println("----------------------");

	}

  private void pattern_D() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==5||row==5||col==3)//D
				  System.out.print("* ");	
				else
				  System.out.print("  ");	
			}
			System.out.println();
		}  
		System.out.println("----------------------");

	}

	private void pattern_E() {
	    
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==1||row==5||row==3)  //E
				  System.out.print("* ");
				else
				  System.out.print("  ");
			}
			
			System.out.println();
		}
		System.out.println("----------------------");


	}
  private void pattern_F() {
        
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==1||row==3)    //F
				  System.out.print("* ");	
				else
				  System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}

  private void pattern_G() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)   //G
			{
				if(row==1||col==1||row==5&&col<4||col==3&&row>2||row==3&&col>3||col==5&&row>2)
				  System.out.print("* ");
				else
				  System.out.print("  ");	
				
			}
			System.out.println();
		}
		
		System.out.println("----------------------");

		
	}
  private void pattern_H() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1||row==3||col==5) //H
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_I() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==3||row==5)//I
				  System.out.print("* ");
				else
				  System.out.print("  "); 	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_J() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1||col==3||row==5&&col<3||col==1&&row>3)//J
				 System.out.print("* ");	
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_K() {

      for(int row=1;row<=5;row++)
      {
   	   for(int col=1;col<=5;col++)   //K
   	   {
   		   if(col==1||row==2&&col<3||col==3&&row<2||row==4&&col<3||col==3&&row>4)
   			System.out.print("* ");
   		   else
   			System.out.print("  ");   
   		   
   	   }
   	   System.out.println();
      }
	 System.out.println("----------------------");

 }
  private void pattern_L() {
	  
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)    //L
			{
				if(col==1||row==5)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		
		System.out.println("----------------------");

	}
  private void pattern_M() {

		int no = 10;
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(col==1||col==row||col==9||col==no-row)   //M
				  System.out.print("* ");	
				else
				  System.out.print("  ");	
			}
			System.out.println();
		}

		System.out.println("----------------------");

	}
  private void pattern_N() {
		
		for(int row =1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1||col==5||col==row)   //N
				  System.out.print("* ");
				else
				  System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

   }
  private void pattern_O() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)      //O
			{
				if(col==1&&row!=1&&row!=5||row==1&&col!=1&&col!=5||col==5&&row!=1&&row!=5||row==5&&col!=1&&col!=5)
				  System.out.print("* ");
				else
				  System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("----------------------");

		
	}
  private void pattern_P() {
      
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)      //P
			{
				if(col==1||row==1&&col!=5||col==5&&row<3&&row!=1&&row!=3||row==3&&col!=5)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_Q() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)    //Q
			{
				if(col==1&&row<4&&row!=1&&row!=3||row==1&&col!=1&&col!=5||col==5&&row<4&&row!=1&&row!=3||row==3&&col!=1&&col!=5||col==row&&col>3)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_R() {
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1||row==1||col==5&&row<4||row==3&&col!=1||row==col&&col>3)//R
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_S() {
      
		for(int row=1;row<=5;row++)
		{
		    for(int col=1;col<=5;col++)
		    {
		    	if(row==1||row==col||row==5) //S
		    	 System.out.print("* ");
		    	else
		    	 System.out.print("  ");	
		    }
		    System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_T() {
      
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)   //T
			{
				if(row==1||col==3)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_U() {

		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1&&row!=5||row==5&&col!=1&&col!=5||col==5&&row!=5)  //U
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_V() {
	    
		int no = 10; 
		
		for(int row=1;row<=5;row++)     //V
		{
			for(int col=1;col<=10;col++)
			{
				if(row==col||col==no-row)
				 System.out.print("* ");
				else
				 System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	
		
		
	}
  private void pattern_W() {
      
		int no=6;
		int no1=4;
		
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=10;col++)
			{
				if(col==1||col==10||col==no-row||col==no1+row)  //W
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_X() {
      
		int no=6;
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)    //X
			{
				if(col==row||col==no-row)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}
  private void pattern_Y() {

	  int no=6;
	
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)                            //Y
		{
			if(col==row&&row<4||col==no-row&&row<3||col==3&&row>3)
			 System.out.print("* ");
			else
			 System.out.print("  ");	
		}
		System.out.println();
	}
	System.out.println("----------------------");

	
 }
  private void pattern_Z() {

		int no=6;
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)      //Z
			{
				if(row==1||col==no-row||row==5)
				 System.out.print("* ");
				else
				 System.out.print("  ");	
			}
			System.out.println();
		}
		System.out.println("----------------------");

	}

}
