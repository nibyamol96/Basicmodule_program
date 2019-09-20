package arraymarkdecrement;

import java.util.Scanner;

public class Markdecrement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=sc.nextInt();
		int[] mark = new int[size];
		int temp=0;
		System.out.println("Enter the mark of students");
		for(int i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
            	if (mark[i] < mark[j]) 
                {
                    temp = mark[i];
                    mark[i] = mark[j];
                    mark[j] = temp;
                }
            }
            
        }
		System.out.println(" Priority of the mark is:");
		for(int i=0;i<size;i++)
		{
			System.out.println(mark[i]);
		}
	}

}


