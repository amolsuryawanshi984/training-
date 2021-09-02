//1) write a program for arithmetic operation using  java exception handling mechanism.
//2) write a program to check voter person age is eligible or not using java exception handling mechanism 
// class ArithmeticUsingEx start
class ArithmeticUsingEx
{   
    int a,b;
    // void arithmeticMethod start
    void arithmeticMethod(int a, int b)
    {
        this.a = a;
        this.b = b;
        // try block start
        try
        {
            System.out.println("Sum: "+(a+b));
            System.out.println("Sub: "+(a-b));
            System.out.println("Mul: "+(a*b));
            System.out.println("Div: "+(a/b));
        }//try block end
        // catch block start
        catch(Exception e)
        {
            System.out.println("Division by zero is not allowed");
        }// catch block end
    }//void arithmeticMethod end
    public static void main(String[] args) 
    {
        ArithmeticUsingEx obj = new ArithmeticUsingEx();
        obj.arithmeticMethod(10,0);
    }
}//class ArithmeticUsingEx end
/*
Output:
Sum: 10
Sub: 10
Mul: 0
Division by zero is not allowed
*/