/*
2)Write a program to generate employee ID-Card(image not required,id card show on console) using Java OOP Consepts. 
*/
// abstract class start
abstract class IdSource 
{
	static int idNum;
    static String empName;
    static String companyName;
    static String dept;
    static String edu;
    static String mobailNum;
    static String email;

    abstract void getSource(int idNum,String empName,String companyName,String dept,String edu,String mobailNum,String email);
    abstract void makeIdCard();
}// abstract class end
//class IdCardMaker start
class IdCardMaker extends IdSource
{
	public void getSource(int idNum,String empName,String companyName,String dept,String edu,String mobailNum,String email)
    {
    	this.idNum=idNum;
    	this.empName=empName;
    	this.companyName=companyName;
    	this.dept=dept;
    	this.edu=edu;
    	this.mobailNum=mobailNum;
    	this.email=email;
    }
	void makeIdCard()
	{
		System.out.println("--------------------------------------");
        System.out.println(companyName);
        System.out.println("--------------------------------------");
        System.out.println("EmpName: "+empName);
        System.out.println("EmpID: "+idNum);
        System.out.println("Dept: "+dept);
        System.out.println("Edu: "+edu);
        System.out.println("Mobile Number: "+mobailNum);
        System.out.println("Email: "+email);
        System.out.println("--------------------------------------");
	}
}// class IdCardMaker end
// class IdCard start
class IdCard 
{
	public static void main(String[] args) 
	{
		IdSource ids = new IdCardMaker();
		ids.getSource(101,"Abhas Malik","IBM pvt ltd.","1155","Software Engg.","9878545645","abhasmalik123@gmail.com");
		ids.makeIdCard();
	}
}// class IdCard end