package com.exception_handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SuppressWarnings("serial")
class ListTooLargeException extends RuntimeException 
{
	ListTooLargeException (String message)
	{
		super (message) ;
	}
        
}
public class example9
{
    public void analyze(List<String> data)
    {
        if (data.size () > 50)
     {
            throw new ListTooLargeException("Money can't exceed 50 items!");
        }
}
    public static void main(String[] args) {
        example9 obj = new example9 () ;
        List<String> data = new ArrayList<>(Collections.nCopies (100,"Customer Details"));
        obj.analyze (data);
}
}

