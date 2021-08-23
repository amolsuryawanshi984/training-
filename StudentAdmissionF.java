import java.util.*;
class StudentAdmissionF 
{
	static String name,cls,admdate,address,email, mobile;
	static char div;
	Scanner sc;
	StudentAdmissionF(char div)
	{
		this.div = div;
	}
	
	StudentAdmissionF(String cls,String name)
	{
		this.cls = cls;
		this.name = name;
	}
	
	StudentAdmissionF(String admdate)
	{
		this.admdate = admdate;
	}
	
	StudentAdmissionF(String email, String mobile,String address)
	{
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	StudentAdmissionF()
	{
		sc = new Scanner(System.in);
	}
	void display()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Class: "+this.cls);
		System.out.println("Div: "+this.div);
		System.out.println("Admission Date: "+this.admdate);
		System.out.println("Address: "+this.address);
		System.out.println("Email: "+this.email);
		System.out.println("Mobile Number: "+this.mobile);
	}
	void getTerminate()
	{
		System.out.print("If you want to Terminate enter Y else N: ");
		String s = sc.next();
		char c = s.charAt(0);

		if(c == 'Y' || c == 'y' )
		{
			name="";
			cls="";
			admdate="";
			address="";
			email="";
			mobile="";
			div=' ';
			display();
		}
	}
	void changeDiv()
	{
		System.out.print("If you want to change Div then enter Y else N: ");
		String s = sc.next();
		char c = s.charAt(0);
		if(c == 'Y' || c == 'y' )
		{
			System.out.print("Enter Div: ");
			String d= sc.next();
			div = d.charAt(0);
			display();
		}
	}
	void changeAdd()
	{
		System.out.print("If you want to change address then enter Y else N: ");
		String s = sc.next();
		char c = s.charAt(0);

		if(c == 'Y' || c == 'y' )
		{
			System.out.print("Enter address: ");
			address= sc.next();
			display();
		}	
	}
	void changeMobile()
	{
		System.out.print("If you want to change mobile number then enter Y else N: ");
		String s = sc.next();
		char c = s.charAt(0);

		if(c == 'Y' || c == 'y' )
		{
			System.out.print("Enter Mobile Number: ");
			mobile= sc.next();
			display();
		}
	}	
	void changeEmail()
	{
		System.out.print("If you want to change email then enter Y else N: ");
		String s = sc.next();
		char c = s.charAt(0);

		if(c == 'Y' || c == 'y' )
		{
			System.out.print("Enter Email Number: ");
			email= sc.next();
			display();
		}
		else
		{
			display();
		}
	}
	public static void main(String[] args) 
	{
		new StudentAdmissionF('A');
		new StudentAdmissionF("7th","Amit");
		new StudentAdmissionF("15-JUN-2015");
		new StudentAdmissionF("amit@gmail.com","9856784152","Gandhi Nagar,Nagpur.");
		StudentAdmissionF sa = new StudentAdmissionF();
		sa.display();
		sa.getTerminate();
		sa.changeDiv();
		sa.changeAdd();
		sa.changeMobile();
		sa.changeEmail();
		
	}
}
