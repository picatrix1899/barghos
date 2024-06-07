package org.barghos.util.flag;


public interface FlagField8R extends FlagFieldR
{
	default int size()
	{
		return 8;
	}
	
	boolean hasAt(int index);
	
	boolean has(byte mask);
	
	byte get();
}
