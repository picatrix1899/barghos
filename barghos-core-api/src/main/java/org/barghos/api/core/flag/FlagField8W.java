package org.barghos.api.core.flag;


public interface FlagField8W extends FlagField8R, FlagFieldW
{
	FlagField8W hasAt(int index, boolean value);
	FlagField8W has(byte mask, boolean value);
	FlagField8W clear();
	FlagField8W set(byte flag);
}
