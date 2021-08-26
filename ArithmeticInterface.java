// Create Interface and perform perform arithmetic operations using interface
// interface MyInterface start
interface MyInterface
{
	void arithmetic(int a,float b);
}// interface MyInterface end
// class MyArithmetic start
class MyArithmetic implements MyInterface 
{
	public void arithmetic(int a,float b)
	{
        System.out.println("Add:"+(a+b));
        System.out.println("Sub:"+(a-b));
        System.out.println("Mul:"+(a*b));
        System.out.println("Div:"+(a/b));		
	}
}//class MyArithmetic end
//class ArithmeticInterface start
class ArithmeticInterface  
{
	public static void main(String[] args) 
	{
		MyInterface obj = new MyArithmetic();
		obj.arithmetic(75,15.2f);
	}
}//class ArithmeticInterface end