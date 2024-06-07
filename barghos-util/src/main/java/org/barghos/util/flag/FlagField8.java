package org.barghos.util.flag;

/**
 * 
 */
public class FlagField8 implements FlagField8W
{
	private byte flag = 0;

	public FlagField8() { }
	
	public FlagField8(byte flag) { set(flag); }

	public boolean hasAt(int index)
	{
		int mask = 0b1 << index;
		
		return has((byte)mask);
	}

	public boolean has(byte mask)
	{
		return (this.flag & mask) == mask;
	}

	public FlagField8 hasAt(int index, boolean value)
	{
		int mask = 0b1 << index;
		
		has((byte)mask, value);
		
		return null;
	}

	public FlagField8 has(byte mask, boolean value)
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

	public FlagField8 clear()
	{
		this.flag = 0;
		
		return this;
	}

	public byte get()
	{
		return this.flag;
	}

	public FlagField8 set(byte flag)
	{
		this.flag = flag;
		
		return this;
	}
}
