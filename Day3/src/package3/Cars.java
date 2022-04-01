package package3;

public class Cars {
	
	String str;
	Cars(String st)
	{
		str=st;
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) {

		
		Cars c=new Cars("This is Audi");
		Cars c1=new Cars("This is BMW");
		Cars c2=new Cars("This is Benz");
		c.display();
		c1.display();
		c2.display();
		
	}

}
