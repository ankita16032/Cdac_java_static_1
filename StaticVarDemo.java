package static_1;

public class StaticVarDemo {

	static int num=1;
	public void display()
	{
		num++;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
	System.out.println(num);
	System.out.println(StaticVarDemo.num);
	}

}
