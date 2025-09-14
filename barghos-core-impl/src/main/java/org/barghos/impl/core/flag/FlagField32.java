package org.barghos.impl.core.flag;

import org.barghos.api.core.flag.FlagField32W;
import org.barghos.api.core.flag.FlagFieldW;

/**
 * 
 */
public class FlagField32 implements FlagField32W
{
	private int flag = 0;

	public FlagField32() { }
	
	public FlagField32(int flag) { flag(flag); }

	public boolean getAt(int index)
	{
		int mask = 0b1 << index;
		
		return get(mask);
	}

	public boolean get(int mask)
	{
		return (this.flag & mask) == mask;
	}

	public FlagField32 setAt(int index, boolean value)
	{
		int mask = 0b1 << index;
		
		setMask(mask, value);
		
		return null;
	}

	public FlagField32 setMask(int mask, boolean value)
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

	public FlagField32 clear()
	{
		this.flag = 0;
		
		return this;
	}

	public int flag()
	{
		return this.flag;
	}

	public FlagField32 flag(int flag)
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
