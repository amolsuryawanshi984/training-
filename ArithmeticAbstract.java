// create abstract class and using abstract class perform arithmetic operations

// abstract class start 
abstract class MyAbstract  
{
	abstract void arithmetic(int a,float b);
}// abstract class end

// class Arithmetic start 
class Arithmetic extends MyAbstract 
{
	public void arithmetic(int a,float b)
	{
        System.out.println("Add:"+(a+b));
        System.out.println("Sub:"+(a-b));
        System.out.println("Mul:"+(a*b));
        System.out.println("Div:"+(a/b));		
	}
}// class Arithmetic end

// class ArithmeticAbstract start 
class ArithmeticAbstract 
{
	public static void main(String[] args) 
	{
		MyAbstract obj = new Arithmetic();
		obj.arithmetic(20,15.4f);
	}
}// class ArithmeticAbstract end
