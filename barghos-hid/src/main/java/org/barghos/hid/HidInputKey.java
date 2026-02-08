package org.barghos.hid;

import java.util.Objects;

public class HidInputKey
{
	public final int slot;
	public final long id;
	
	public HidInputKey(int slot, long id)
	{
		this.slot = slot;
		this.id = id;
	}
	
	public int hashCode()
	{
		return Objects.hash(this.slot, this.id);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(obj == this) return true;
		
		if(obj instanceof HidInputKey key)
		{
			if(this.slot != key.slot) return false;
			if(this.id != key.id) return false;
			
			return true;
		}
		
		return false;
	}
}
