import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {                 
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    for(int i= 1; i<=n;i++)
    {
    	for(int k=2;k<=i;k++)
    	{
    	 	System.out.print(" ");
    	}
    	for(int j = n-1;j>=i ;j--)
    	{
    		System.out.print("*");
    	}
    	
    	for(int l = n-2;l>=i ;l--)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}

}
