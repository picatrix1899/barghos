package org.barghos.api.core.flag;


public interface FlagField64W extends FlagField64R, FlagFieldW
{
	FlagField64W setAt(int index, boolean value);
	FlagField64W setMask(long mask, boolean value);
	FlagField64W clear();
	FlagField64W flag(long flag);
}
