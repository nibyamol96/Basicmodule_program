package combination;

import java.util.Scanner;

public class findingcombination {
	public static void main(String[] args) {
	int n, c, fact = 1;
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of alphabets in your name");
	 n=sc.nextInt(); 
       for (c = 1; c <= n; c++)
          fact = fact*c;
   
       System.out.println("Number of combination is"+fact);
    

}
}
