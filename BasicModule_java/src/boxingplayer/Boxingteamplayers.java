package boxingplayer;

import java.util.Scanner;

public class Boxingteamplayers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int size=sc.nextInt();
		int[] players = new int[size];
		int temp=0;
		int index=0;
		System.out.println("Enter the number of fouls made by each players");
		for(int i=0;i<size;i++)
		{
			players[i]=sc.nextInt();
		}
		temp=players[0];
		for(int i=0; i<size; i++) 
        {
			if(players[i]<temp)
				
            	{
                    temp = players[i];
                    index=i+1;
            	} 
               
            
        }
        
		System.out.println("the eligible players is player no:"+index+"("+temp+"fouls)");
		
	}

}
