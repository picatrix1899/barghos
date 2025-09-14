package org.barghos.api.core.flag;


public interface FlagField16R extends FlagFieldR
{
	default int size()
	{
		return 16;
	}
	
	boolean getAt(int index);
	
	boolean get(short mask);
	
	short flag();
}
