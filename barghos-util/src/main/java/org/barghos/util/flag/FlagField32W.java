package org.barghos.util.flag;


public interface FlagField32W extends FlagField32R, FlagFieldW
{
	FlagField32W setAt(int index, boolean value);
	FlagField32W setMask(int mask, boolean value);
	FlagField32W clear();
	FlagField32W flag(int flag);
}
