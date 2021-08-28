/*
1) Write a program to print the area of Oval,Triangle,Rectangle,Pentagon,Hexagon,Trapezium,& Circle
in this program you must be use all OOP concepts i.e.
- Class,Object,Inheritance,Interface,Polymorphisam,Abstaction.
*/
// interface MyArea start
interface MyArea
{
	float pi=3.14f;
	void areaMethod();
}// interface MyArea end
// class OvalClass start
class OvalClass implements MyArea
{
	int majorAxis, minorAxis;
	OvalClass(int majorAxis , int minorAxis)
	{
		this.majorAxis=majorAxis;
		this.minorAxis=minorAxis;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Oval: "+(pi*majorAxis*minorAxis));
	}
}//class OvalClass end
// class TriangleClass start
class TriangleClass implements MyArea
{
	int base, height;
	TriangleClass(int base , int height)
	{
		this.base=base;
		this.height=height;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Triangle: "+((base*height)/2));
	}
}// class TriangleClass end
// class RectangleClass start
class RectangleClass implements MyArea
{
	int length, width;
	RectangleClass(int length , int width)
	{
		this.length=length;
		this.width=width;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Rectangle: "+(length*width));
	}
}// class RectangleClass end
// class PentagonClass start
class PentagonClass implements MyArea
{
	int apothem, sideOfPentagon;
	PentagonClass(int apothem , int sideOfPentagon)
	{
		this.apothem=apothem;
		this.sideOfPentagon=sideOfPentagon;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Pentagon: "+(2.5f*sideOfPentagon*apothem));
	}
}// class PentagonClass end
// class HexagonClass start
class HexagonClass implements MyArea
{
	int side;
	HexagonClass(int side)
	{
		this.side=side;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Hexagon: "+(((3*1.7321f)/2)*side*side));
	}
}// class HexagonClass end
// class TrapeziumClass start
class TrapeziumClass implements MyArea
{
	int base1,base2,height;
	TrapeziumClass(int base1,int base2,int height)
	{
		this.base1=base1;
		this.base2=base2;
		this.height=height;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Trapezium: "+(((base1+base2)/2)*height));
	}
}// class TrapeziumClass end
// class CircleClass start
class CircleClass implements MyArea
{
	int radius;
	CircleClass(int radius)
	{
		this.radius=radius;
	}
	public void areaMethod()
	{
		System.out.println("Area Of Circle: "+(pi*radius*radius));
	}
}// class CircleClass end
// class TestArea start 
class TestArea  
{
	// main start
	public static void main(String[] args) 
	{
		MyArea oc = new OvalClass(10,20);
		oc.areaMethod();
		MyArea tc = new TriangleClass(10,15);
		tc.areaMethod();
		MyArea rc = new RectangleClass(20,40);
		rc.areaMethod();
		MyArea pc = new PentagonClass(18,5);
		pc.areaMethod();
		MyArea hc = new HexagonClass(10);
		hc.areaMethod();
		MyArea tec = new TrapeziumClass(10,10,15);
		tec.areaMethod();
		MyArea cc = new CircleClass(10);
		cc.areaMethod();
	}// main end
}// class TestArea end