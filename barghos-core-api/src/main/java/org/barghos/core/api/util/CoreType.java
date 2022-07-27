package org.barghos.core.api.util;


public enum CoreType implements DataType
{
	BYTE(1),
	BOOL(1),
	SHORT(2),
	INT(4),
	LONG(8),
	FLOAT(4),
	DOUBLE(8),
	
	TUP2B(2 * 1),
	TUP3B(3 * 1),
	TUP4B(4 * 1),
	
	TUP2BO(2 * 1),
	TUP3BO(3 * 1),
	TUP4BO(4 * 1),
	
	TUP2S(2 * 2),
	TUP3S(3 * 2),
	TUP4S(4 * 2),
	
	TUP2I(2 * 4),
	TUP3I(3 * 4),
	TUP4I(4 * 4),
	
	TUP2L(2 * 8),
	TUP3L(3 * 8),
	TUP4L(4 * 8),
	
	TUP2F(2 * 4),
	TUP3F(3 * 4),
	TUP4F(4 * 4),
	
	TUP2D(2 * 8),
	TUP3D(3 * 8),
	TUP4D(4 * 8),
	;
	
	private int bytes;
	
	private CoreType(int bytes)
	{
		this.bytes = bytes;
	}
	
	@Override
	public int bytes()
	{
		return this.bytes;
	}
	
	@Override
	public int bytes(int multiplier)
	{
		return this.bytes * multiplier;
	}
}
