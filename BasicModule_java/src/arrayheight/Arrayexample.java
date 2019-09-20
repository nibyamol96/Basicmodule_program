package arrayheight;

import java.util.Scanner;

public class Arrayexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=sc.nextInt();
		float[] height = new float[size];
		float temp=0;
		System.out.println("Enter the heights of students");
		for(int i=0;i<size;i++)
		{
			height[i]=sc.nextFloat();
		}
		for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
            	if (height[i] > height[j]) 
                {
                    temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;
                }
            }
            
        }
		for(int i=0;i<size;i++)
		{
			System.out.println(height[i]);
		}
	}

}
