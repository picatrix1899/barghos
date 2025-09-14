package org.barghos.impl.core.flag;

import org.barghos.api.core.flag.FlagField16W;
import org.barghos.api.core.flag.FlagFieldW;

/**
 * 
 */
public class FlagField16 implements FlagField16W
{
	private short flag = 0;

	public FlagField16() { }
	
	public FlagField16(short flag) { flag(flag); }

	public boolean getAt(int index)
	{
		int mask = 0b1 << index;
		
		return get((short)mask);
	}

	public boolean get(short mask)
	{
		return (this.flag & mask) == mask;
	}

	public FlagField16 setAt(int index, boolean value)
	{
		int mask = 0b1 << index;
		
		setMask((short)mask, value);
		
		return null;
	}

	public FlagField16 setMask(short mask, boolean value)
	{
		if(value)
		{
			this.flag |= mask;
		}
		else
		{
			this.flag &= ~mask;
		}
		
		return this;
	}

	public FlagField16 clear()
	{
		this.flag = 0;
		
		return this;
	}

	public short flag()
	{
		return this.flag;
	}

	public FlagField16 flag(short flag)
	{
		this.flag = flag;
		
		return this;
	}

	@Override
	public boolean hasAt(int index)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FlagFieldW hasAt(int index, boolean value)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
