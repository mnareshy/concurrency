package com.java.concurrency;

import com.java.concurrency.executors.SampleExecutor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	SampleExecutor sampleExecutor = new SampleExecutor();
    	sampleExecutor.execute();
    }
}
