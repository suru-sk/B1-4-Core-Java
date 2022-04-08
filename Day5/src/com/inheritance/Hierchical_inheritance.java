
package com.inheritance;
class CellPhones
{
	void message()
	{
		System.out.println("Hi, Suresh");
	}
	void call()
	{
		System.out.println("I am calling Siri");
	}
}
class SamsungGalaxym30s extends CellPhones
{
	void facelock()
	{
		System.out.println("Hi, Facelock");
	}
}
class Iphone extends CellPhones
{
	void games()
	{
		System.out.println("PUBG");
	}
}

public class Hierchical_inheritance {

	public static void main(String[] args) {
		
		Iphone o=new Iphone();
		o.games();
		o.message();
		o.call();
		SamsungGalaxym30s m=new SamsungGalaxym30s();
		m.facelock();
	}

}