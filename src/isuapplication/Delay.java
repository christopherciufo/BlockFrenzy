// The "DelayTestProgram" class.

package isuapplication;

public class Delay
{
    public static void go (int time)
    {
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }
} // DelayTestProgram class
