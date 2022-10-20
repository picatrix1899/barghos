package org.barghos.math;


public class Stopwatch
{
	private long startTime;
	private long endTime;
	
	public void start()
	{
		this.startTime = System.nanoTime();
	}
	
	public void stop()
	{
		this.endTime = System.nanoTime();
	}
	
	public long getDelta()
	{
		return this.endTime - this.startTime;
	}
	
	public String toString()
	{
		long delta = getDelta();
		long deltaMiS = delta / 1000;
		long deltaMS = delta / 1000 / 1000;
		return deltaMS + "ms/" + deltaMiS + "µS/" + delta + "ns";
	}
}
