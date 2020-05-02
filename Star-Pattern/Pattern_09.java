import java.util.Scanner;

/*
          *
         ***
        *****
       *******
      *********
     ***********
*/
public class Pattern_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number");
	      int n = sc.nextInt();
		// int n = 6;
          for(int i =1;i<=n;i++)
    		  {
    	         for(int j =n-1;j>=i;j--) {
    	        	 System.out.print(" ");
    	         }
    	         for(int k =1;k<=i;k++)
    	         {
    	        	 System.out.print("*");
    	         }
			 	 for(int l = 2;l<=i;l++)
    	         {
    	        	 System.out.print("*");
    	         }
    	        System.out.println();
    	         
    	         
    		  }
	}

}
