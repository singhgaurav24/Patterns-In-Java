import java.util.Scanner;

public class Pattern_06 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number");
	      int n = sc.nextInt();
	      
	      for(int i=1;i<=n;i++)
	      {
	    	  for(int j=n;j>=i;j--)
	    	  {
	    		  System.out.print("*");
	    		  
	    	  }
	    	  System.out.println();
	    	  
    		  for(int k =1 ;k<=i;k++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	     
	      }
     
	}
}