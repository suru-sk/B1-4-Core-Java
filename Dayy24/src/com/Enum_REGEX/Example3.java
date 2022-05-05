package com.Enum_REGEX;
enum Bike
{
	Pulser,RoyalEnfiledHimalayan,KtmADV390,R15,RRR
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b;
		b=Bike.RRR;
		switch(b)
		{
		case Pulser:
		System.out.println("You Choose Pulser");
		break;
		case R15:
		System.out.println("You Choose R15");
		break;
		case RoyalEnfiledHimalayan:
		System.out.println("You Choose REH");
		break;
		case KtmADV390:
		System.out.println("You Choose KTM");
		break;
		default:
			System.out.println("INVALID NAME");
		}
	}

}
