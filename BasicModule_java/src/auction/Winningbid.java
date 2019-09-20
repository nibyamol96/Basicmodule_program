package auction;

import java.util.Scanner;

public class Winningbid {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applications");
		int size=sc.nextInt();
		int[] bid = new int[size];
		int temp=0;
		System.out.println("Enter the amount");
		for(int i=0;i<size;i++)
		{
			bid[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++) 
        {
			if(bid[i]>temp)
            	{
                    temp = bid[i];
            	} 
               
            
        }
		System.out.println(" Winning bid:"+temp);
		
	}

}


