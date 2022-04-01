package package3;


public class Constructor {

		String str;
		int a;
		Constructor(String st,int x)
		{
			str=st;
			a=x;
		}
		void display()
		{
			System.out.println(str+" "+a);
			
		}
		public static void main(String[] args) {
	
			Constructor c=new Constructor("Suresh",10);
			c.display();
		}


}
