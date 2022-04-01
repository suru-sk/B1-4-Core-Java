package package3;

public class Nonparameter {
	
	String str;
	int a;
	Nonparameter()
	{
		str="Suresh";
		a=8;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	

	public static void main(String[] args) {
		Nonparameter c=new Nonparameter();
		c.display();
	}


}
