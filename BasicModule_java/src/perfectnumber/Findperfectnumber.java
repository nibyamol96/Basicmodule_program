package perfectnumber;

import java.io.IOException;
import java.util.Scanner;

public class Findperfectnumber {public static void main(String[] args) throws IOException
{


Scanner br=new Scanner(System.in);

System.out.println("Enter a number");
int number=br.nextInt();
int temp=number;
int sum=0;
System.out.println("The divisors of the number are");

for(int i=1;i<=number/2;i++)
{
if(number%i==0)

{
System.out.println(i+"");
sum+=i;
}
}

System.out.println("The sum of the divisors are"+sum);


if(temp==sum)
{
System.out.println("It is a perfect number");
}
else
{
System.out.println("It is not a perfect number");

}



}
}