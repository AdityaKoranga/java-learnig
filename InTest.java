class Num2
{
	int a,b;
	public Num2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int g2()
	{
		return a>b?a:b;
	}
	public int p2()
	{
		return a*b;
	}
}

class Num3 extends Num2
{
	int c;
	public Num3(int x, int y, int z)
	{
		super(x,y);
		c=z;
	}
	public int g3()
	{
		return g2()>c?g2():c;
	}
	public int p3()
	{
		return p2()*c;
	}
}


public class InTest
{
	public static void main(String args[])
	{
		Num3 x=new Num3(4,5,6);
		System.out.println(x.p3());
        // System.out.println(x.g3());

	}
}