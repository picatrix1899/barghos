package org.barghos.util.flag;

/**
 * 
 */
public class SimpleFlag8 implements SimpleFlag8C
{
	private byte flag = 0;

	public SimpleFlag8() { }
	
	public SimpleFlag8(byte flag) { setFlag(flag); }

	public boolean getByIndex(int index)
	{
		int mask = 0b10000000 >> index;
		
		return get((byte)mask);
	}

	public boolean get(byte mask)
	{
		return (this.flag & mask) == mask;
	}

	public SimpleFlag8 setByIndex(int index, boolean value)
	{
		int mask = 0b10000000 >> index;
		
		set((byte)mask, value);
		
		return null;
	}

	public SimpleFlag8 set(byte mask, boolean value)
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

	public SimpleFlag8 clear()
	{
		this.flag = 0;
		
		return this;
	}

	public byte getFlag()
	{
		return this.flag;
	}

	public SimpleFlag8 setFlag(byte flag)
	{
		this.flag = flag;
		
		return this;
	}

}
