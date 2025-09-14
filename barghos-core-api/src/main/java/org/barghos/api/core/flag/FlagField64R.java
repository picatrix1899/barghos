package org.barghos.api.core.flag;


public interface FlagField64R extends FlagFieldR
{
	default int size()
	{
		return 64;
	}
	
	boolean getAt(int index);
	
	boolean get(long mask);
	
	long flag();
}
