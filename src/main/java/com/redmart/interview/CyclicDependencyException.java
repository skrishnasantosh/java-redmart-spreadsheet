package main.java.com.redmart.interview;

public class CyclicDependencyException extends Exception
{	
	private static final long serialVersionUID = -1746083218088823613L;

	public CyclicDependencyException(String message) 
	{
		super(message);
	}
}
