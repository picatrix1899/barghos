package org.barghos.api.core.flag;


public interface FlagFieldW extends FlagFieldR
{
	FlagFieldW hasAt(int index, boolean value);
	FlagFieldW clear();
}
