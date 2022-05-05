package com.JUNIT_Testing;

import org.junit.jupiter.api.Assumptions;

public class Example5 {
	void accept()
	{
		System.setProperty("1", "Soujan");
		Assumptions.assumeTrue("Soujan".equals(System.getProperty("1")));
	}
		void accept1()
		{
			System.setProperty("2", "James");
			Assumptions.assumeFalse("James".equals(System.getProperty("2")));
			
			 
		}
}