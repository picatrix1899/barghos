package org.barghos.util.flag;


public interface FlagField16W extends FlagField16R, FlagFieldW
{
	FlagField16W setAt(int index, boolean value);
	FlagField16W setMask(short mask, boolean value);
	FlagField16W clear();
	FlagField16W flag(short flag);
}
