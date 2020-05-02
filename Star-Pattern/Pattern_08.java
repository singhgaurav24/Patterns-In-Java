import java.util.Scanner;

public class Pattern_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
       for(int i= 1;i<=n;i++)
       {
    	   for(int j = n-1 ;j>=i;j--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int k =1 ;k<=i ;k++)
    	   {
    		   System.out.print(" *");  //Space before star (*)
    	   }
    	   
    	   System.out.println();
       }
	}

}
