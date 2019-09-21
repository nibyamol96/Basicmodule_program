package casestudy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class casefive {
	public static String name[] = new String[10];
	public static String mail[] = new String[10];
	public static String[] nam=new String[50];
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	String date;
	String startdate;
	String enddate;
	public static int[] booked=new int[25];
	protected static int i=1;
	
	/* public Registrationand_display(String name)
	 {
		 for(int j=0;j<i;j++)
		 {
			 this.nam[j]=name;
		 }
	 }*/
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		char option;
		int roomId;
		for(int i=0;i<25;i++)
		{
		booked[i]=0;
		}
		//String name;
		    String address;
		    String contactNumber;
		    String email;
		    String proofType;
		    String proofID;
		    String n,a;    
		   String opt;
		    int i=0;
		   
		    do
		    {
		    System.out.println("Registration");
		    //i++;
		      System.out.println("Enter your name");
		    //name=br.readLine();
		      i++;
		        name[i] = br.readLine();
		       
		     
		   
		    System.out.println("Enter your address");
		    address=br.readLine();
		    System.out.println("Contact Number");
		    contactNumber=br.readLine();
		    System.out.println("E-Mail ID");
		    mail[i]=br.readLine();
		   
		    System.out.println("Enter proof type");
		    proofType=br.readLine();
		    System.out.println("Enter proof id");
		    proofID=br.readLine();
		    System.out.println("Thank you for registering. Your id is "+i+"..");
		    System.out.println("Do you want to book a room (y/n)?");
		    opt=br.readLine();
		    if(opt.equalsIgnoreCase("y"))
		    booking();
		    System.out.println("Do you want to continue registration (y/n)?");
		    n=br.readLine();
		    }
		    while(n.equalsIgnoreCase("y"));
		    ViewCustomers(i);
		   
		}
		public static void ViewCustomers(int a)throws IOException
		{    
		    int j;
		    String startdate;
		    String enddate;
		    System.out.println("view all booking");
		    System.out.println("Enter the start date");
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			startdate=br.readLine();
			System.out.println("Enter the end date");
			enddate=br.readLine();
			System.out.println("the booking made from "+startdate+" to "+enddate+" are ");
		    System.out.println("Customer ID  Customername");
		    for(j=1;j<=a;j++)
		    {
		       // name[i] = br.readLine();
		    System.out.println(j+"\t\t"+name[j]);
		     
		    }
		    System.out.println("Thank You");
		   
		           
		    }
		/*public static void hotel() throws IOException
		{
			char option;
			do
			{

			System.out.println("\n1.Book");
			System.out.println("2.Check Status");
			System.out.println("3.Exit");
			System.out.println("Choose Your option");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			option=(char)br.read();
			switch(option)
			{
			case '1': booking();
			/*if(bookingFlag==1)
			{
			booked[i]=
			}
			break;
			case '2':
			checkStatus(); break;
			case '3':System.exit(0);

			}
			//System.out.println("Do you want to continue?(1/0)");
			// ch=Integer.parseInt(br.readLine());
			}while(option!='3');
			}*/

			private static void checkStatus() throws IOException {
			// TODO Auto-generated method stub
			/*int roomNo;
			System.out.println("Enter your room No.");

			roomNo=Integer.parseInt(br.readLine());
			// roomNo=Integer.parseInt(br.readLine());
			System.out.println(roomNo);*/
			System.out.print("Enter your Room Id:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int roomId=Integer.parseInt(br.readLine());
			for(int j=0;j<=25;j++)
			{
			if(booked[roomId-1]>0)
			{
			System.out.println("Room number "+roomId+" is booked.");
			break;
			}
			else
			{
			System.out.println("Room number "+roomId+" is not booked.");
			break;
			}

			}


			}
			private static void booking() throws IOException {
			// TODO Auto-generated method stub
			String ac;
			String cot;
			String cable;
			String wifi;
			String laundry;
			int total=0;
			int flag=0;
			int roomno=0;
			System.out.println("\nBooking");
			System.out.println("Please choose the services required.");
			System.out.println("AC/non-AC(AC/nAC)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			ac=br.readLine();
			System.out.println("Cot(Single/Double)");
			cot=br.readLine();
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=br.readLine();
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=br.readLine();
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=br.readLine();
			System.out.println("Enter the date of booking");
			laundry=br.readLine();

			if(ac.equalsIgnoreCase("AC"))
			total=total+600;
			else if(ac.equalsIgnoreCase("nAC"))
			total=total+200;
			else
			ac="NULL";

			if(cot.equalsIgnoreCase("Single"))
			total=total+180;
			else if(cot.equalsIgnoreCase("Double"))
			total=total+260;
			else
			cot="NULL";

			if(cable.equalsIgnoreCase("C"))
			total=total+200;
			else if(cable.equalsIgnoreCase("nC"))
			total=total+150;
			else
			cable="NULL";

			if(wifi.equalsIgnoreCase("W"))
			total=total+300;
			else if(wifi.equalsIgnoreCase("nW"))
			total=total+250;
			else
			wifi="NULL";

			if(laundry.equalsIgnoreCase("L"))
			total=total+400;
			else if(laundry.equalsIgnoreCase("nL"))
			total=total+350;
			else
			laundry="NULL";

			System.out.println("The Total charge is "+total);
			System.out.println("The services chosen are");
			System.out.println(ac);
			System.out.println(cot);
			System.out.println(cable);
			System.out.println(wifi);
			System.out.println(laundry);
			System.out.println("Do you want to proceed?(yes/no)");
			String proceed=br.readLine();
			if(total>0 &&(proceed.equalsIgnoreCase("yes")))
			{
			for(int i=0;i<25;i++)
			{
			if(booked[i]==0)
			{
			booked[i]=total;
			roomno=i+1;
			flag=1;
			break;
			//i++;
			}
			}
			if(flag==1)
			System.out.println("Thank you for booking. Your room number is "+roomno+ ".");

			//Thank you for booking. Your room number is 2.
			}


		}
		}




