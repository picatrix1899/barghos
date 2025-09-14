package org.barghos.impl.core.flag;

import org.barghos.api.core.flag.FlagField64W;
import org.barghos.api.core.flag.FlagFieldW;

/**
 * 
 */
public class FlagField64 implements FlagField64W
{
	private long flag = 0;

	public FlagField64() { }
	
	public FlagField64(long flag) { flag(flag); }

	public boolean getAt(int index)
	{
		long mask = 0b1 << index;
		
		return get(mask);
	}

	public boolean get(long mask)
	{
		return (this.flag & mask) == mask;
	}

	public FlagField64 setAt(int index, boolean value)
	{
		long mask = 0b1 << index;
		
		setMask(mask, value);
		
		return null;
	}

	public FlagField64 setMask(long mask, boolean value)
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

	public FlagField64 clear()
	{
		this.flag = 0;
		
		return this;
	}

	public long flag()
	{
		return this.flag;
	}

	public FlagField64 flag(long flag)
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
