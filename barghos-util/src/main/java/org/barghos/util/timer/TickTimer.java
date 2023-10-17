package org.barghos.util.timer;


public interface TickTimer
{
	void start();
	void stop();
	
	void reset();
	
	boolean tick();
	
	void setTicks(int ticks);
	void setTicks(int ticks, boolean reset);
	
	int getTicks();
	int getPassedTicks();	
}
