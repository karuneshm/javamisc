package com.java.misc;

public class Exceptions {
	
	public static void main(String[] args) {
	
		System.out.println(methodReturningValue());

	}
	
	
	static int methodReturningValue()
    {
        String s = null;
        try
        {
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");
            return 30;
 
            //Control will be passed to main() method after executing this block
        }
    }
	
	private static String get() {
		try {
			
			throw new NullPointerException();
			
		} catch(Exception e) {
			return "In Catch";
			
		} finally {
			return "in finally";
		}
	}

}
