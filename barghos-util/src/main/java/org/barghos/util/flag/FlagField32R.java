package org.barghos.util.flag;


public interface FlagField32R extends FlagFieldR
{
	default int size()
	{
		return 32;
	}
	
	boolean getAt(int index);
	
	boolean get(int mask);
	
	int flag();
}
