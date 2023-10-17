package org.barghos.hash;

public interface Hash
{
	int length();
	int type();
	
	default byte[] get()
	{
		return get(new byte[length()]);
	}
	
	byte[] get(byte[] res);
	
	byte getAtIndex(int index);
	
	default boolean equals(Hash other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(this.type() != other.type()) return false;
		
		int len = length();
		
		if(len != other.length()) return false;
		
		for(int i = 0; i < len; i++)
		{
			if(getAtIndex(i) != other.getAtIndex(i)) return false;
		}
		
		return true;
	}
}
