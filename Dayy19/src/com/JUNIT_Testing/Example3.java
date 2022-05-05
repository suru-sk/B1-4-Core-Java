package com.JUNIT_Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Example3 {
	@BeforeEach
	@Test
	static void print()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	
	@Test
	void print1()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}

}