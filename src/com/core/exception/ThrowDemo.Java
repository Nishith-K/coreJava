class ThrowDemo
{
	static void sample()
	{
		try
		{
			throw new NullPointerException("Null Exce");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside sample().");
			throw e;  //  Rethrow the Exception 
			//System.out.println("Caught inside Sample Once again.");
		}
	}
	public static void main(String ar[])
	{
		try
		{
			sample();
			System.out.println("Main Try ");
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught :"+e);
			System.out.println("Caught in Main.");
		}
		finally
		{
			System.out.println("Entered into Main Finally ");
		}
	}
}