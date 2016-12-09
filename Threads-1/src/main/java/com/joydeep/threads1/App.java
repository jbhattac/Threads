package com.joydeep.threads1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ThreadSyncExample ts = new ThreadSyncExample();
		ts.doWork();
    }
}
