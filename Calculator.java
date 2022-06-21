import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
		
		int ch;
	    Double num1, num2, res;

	    Scanner sc = new Scanner(System.in);
	    do
	    {
	    	System.out.println("Calculator Options : ");
		    System.out.println("1. Addition \n");
		    System.out.println("2. Subtraction \n");
		    System.out.println("3. Multiplication \n");
		    System.out.println("4. Division \n");
			System.out.println("5. Power \n");
		   
		    System.out.println("6. Quit \n");
		    System.out.println("Enter your choice : ");
		    ch = sc.nextInt();
		    
		    switch (ch) 
		    {
		    case 1:
		    		System.out.println("Enter two numbers : ");
		    		num1 = sc.nextDouble();
		    		num2 = sc.nextDouble();
		    		res = num1 + num2;
		    		System.out.println(num1 + " + " + num2 + " = " + res);
		    		break;
		    		
		    case 2:
			    	System.out.println("Enter two numbers : ");
		    		num1 = sc.nextDouble();
		    		num2 = sc.nextDouble();
		    		res = num1 - num2;
		    		System.out.println(num1 + " - " + num2 + " = " + res);
		    		break;
	    		
		    case 3:
			    	System.out.println("Enter two numbers : ");
		    		num1 = sc.nextDouble();
		    		num2 = sc.nextDouble();
		    		res = num1 * num2;
		    		System.out.println(num1 + " * " + num2 + " = " + res);
		    		break;
		    		
		    case 4:
			    	System.out.println("Enter two numbers : ");
		    		num1 = sc.nextDouble();
		    		num2 = sc.nextDouble();
		    		res = num1 / num2;
		    		System.out.println(num1 + " / " + num2 + " = " + res);
		    		break;
		    		
		 case 5:
		    	
		    	System.out.println("Enter the base and exponent : ");
				int base = sc.nextInt();
				int expo = sc.nextInt();
				res = Power(base, expo);
				System.out.println("Power = " +res);
				break;
		    case 6:
		    		break;

		      default:
		        System.out.println("Invalid choice!!");
		        break;
		    }
	    }while(ch != 6);
	    
	    sc.close();
	}
	public static Double Power(int x,int y)
{
  
    	int res=1;
    	while(x!=0)
    	{
    		res=res * y;
    		--x;
    	}
    	System.out.println(" power of number = "+res);
		return null;
    	

}
}
