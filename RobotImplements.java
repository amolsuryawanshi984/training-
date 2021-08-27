/* -write program of robot class implements interfaces
   -use inheritance for interfaces - multiple ,multilevel
   -use final keyvord for class method and variable ,try to override it in subclass
*/
// interface Intelligence start
interface Intelligence
{
	void intelligenceMethod();
}// interface Intelligence end
// interface SensePerception start
interface SensePerception
{
	void sensePerceptionMethod();
}// interface SensePerception end
// class Robot start  
class Robot implements Intelligence,SensePerception
{
	final String robotName="Robot 2.0";
	final void robotMothod()
	{
		System.out.println("This is final method from robot class "+robotName);
	}

	public void intelligenceMethod()
	{
		System.out.println("This method of Intelligence class");
	}
	public void sensePerceptionMethod()
	{
		System.out.println("This method of sensePerceptionMethod");
	}
}// class Robot end
// class MiniRobot start
/*class MiniRobot extends Robot
{
	//void robotName="MiniRobot"; // error: '(' expected void robotName="MiniRobot";
	void robotMothod() // error: robotMothod() in MiniRobot cannot override robotMothod() in Robot void robotMothod()
	{
		System.out.println("This is final method from Minirobot class "+robotName);
	}
}// class MiniRobot end
*/
// class RobotImplements start
class RobotImplements  
{
	// main method start
	public static void main(String[] args) 
	{
		Intelligence obj1 = new Robot();
		obj1.intelligenceMethod();

		SensePerception obj2 = new Robot();
		obj2.sensePerceptionMethod();
//		MiniRobot obj3= new MiniRobot();
//		obj3.robotMothod();
		Robot obj4 = new Robot();
		obj4.robotMothod();
	}// main method end
}// class RobotImplements end