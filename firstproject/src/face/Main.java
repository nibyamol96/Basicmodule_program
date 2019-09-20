package face;
import java.util.Scanner;
public class Main {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	static int regID=0;
	public Main(String name,String address,String contactNumber,String email,String proofType,String proofId) {
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
	}
	public static void main(String[] args) {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		int regID;
	
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		contactNumber=sc.nextLine();
		email=sc.nextLine();
		proofType=sc.nextLine();
		proofId=sc.nextLine();
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=sc.nextLine();
		address=sc.nextLine();
		contactNumber=sc.nextLine();
		email=sc.nextLine();
		proofType=sc.nextLine();
		proofId=sc.nextLine();
		Main customer=new Main(name,address,contactNumber,email,proofType,proofId);
		//Main customer1=new Main(name,address,contactNumber,email,proofType,proofId);
		customer.register(name, address, contactNumber, email, proofType, proofId);
		
	}
	void register(String name,String address,String contactNumber,String email,String proofType,String proofId) {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contactNumber);
		System.out.println(this.email);
		System.out.println(this.proofType);
		System.out.println(this.proofId);
		System.out.println("your registration id is :"+ ++regID);
	}

}
