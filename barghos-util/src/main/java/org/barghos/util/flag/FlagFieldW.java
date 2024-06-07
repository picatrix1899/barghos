package org.barghos.util.flag;


public interface FlagFieldW extends FlagFieldR
{
	FlagFieldW hasAt(int index, boolean value);
	FlagFieldW clear();
}
