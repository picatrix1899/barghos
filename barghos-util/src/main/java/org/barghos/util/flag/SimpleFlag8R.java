package org.barghos.util.flag;


public interface SimpleFlag8R
{
	default int getDimensions()
	{
		return 8;
	}
	
	boolean getByIndex(int index);
	
	boolean get(byte mask);
	
	byte getFlag();
}
