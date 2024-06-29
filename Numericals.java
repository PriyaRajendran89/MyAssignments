package week1.assign2;



public class Numericals {
	
	public static void main(String[] args) {
		printFibonacci(8);
		printOddNumbers(10);
		isPalindrome(4544);
		
	}

	//print Fibonnaci series
	 static void printFibonacci(int input) {
		
	int num0=0;
	int num1=1;
	int num2;
	System.out.println("Fibonacci series:");
	System.out.println(num0);
	System.out.println(num1);
	for (int i = 0; i < input; i++) {
		
		num2=num0+num1;
		System.out.println(num2);
		//Swaping
		num0=num1;
		num1=num2;
		
	}
		
	}
		
	
	  static void isPalindrome(int n)
	  {
		  
		  int r,sum=0,temp;    
		  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+ " is a palindrome number ");    
		  else    
		   System.out.println(temp+ " is not palindrome");    
		}  
	  
		//print oddnumbers between 1 to 10
	 static void printOddNumbers(int range)
	 {
		 System.out.println("The odd numbers between 1 and 10 are below");
	    for(int i =0; i<range; i ++)	
	    {
	    	if(i%2==1) {
	    		
	    		System.out.println(i);
	    	}
	    }
	 }
	 
	}

