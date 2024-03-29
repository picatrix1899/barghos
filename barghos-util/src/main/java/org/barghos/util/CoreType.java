package org.barghos.util;

/**
 * This enumeration contains the primitive data types like {@code int} and {@code float} aswell as the tuple types.
 * 
 * @author picatrix1899
 */
public enum CoreType implements DataType
{
	/**
	 * This value represents java's primitive type {@code byte}.
	 */
	BYTE(1),
	
	/**
	 * This value represents java's primitive type {@code boolean}.
	 */
	BOOL(1),
	
	/**
	 * This value represents java's primitive type {@code short}.
	 */
	SHORT(2),
	
	/**
	 * This value represents java's primitive type {@code int}.
	 */
	INT(4),
	
	/**
	 * This value represents java's primitive type {@code long}.
	 */
	LONG(8),
	
	/**
	 * This value represents java's primitive type {@code float}.
	 */
	FLOAT(4),
	
	/**
	 * This value represents java's primitive type {@code double}.
	 */
	DOUBLE(8),
	
	/**
	 * This value represents a 2 dimensional {@code byte} tuple.
	 */
	TUP2B(2 * 1),
	
	/**
	 * This value represents a 3 dimensional {@code byte} tuple.
	 */
	TUP3B(3 * 1),
	
	/**
	 * This value represents a 4 dimensional {@code byte} tuple.
	 */
	TUP4B(4 * 1),
	
	/**
	 * This value represents a 2 dimensional {@code boolean} tuple.
	 */
	TUP2BO(2 * 1),
	
	/**
	 * This value represents a 3 dimensional {@code boolean} tuple.
	 */
	TUP3BO(3 * 1),
	
	/**
	 * This value represents a 4 dimensional {@code boolean} tuple.
	 */
	TUP4BO(4 * 1),
	
	/**
	 * This value represents a 2 dimensional {@code short} tuple.
	 */
	TUP2S(2 * 2),
	
	/**
	 * This value represents a 3 dimensional {@code short} tuple.
	 */
	TUP3S(3 * 2),
	
	/**
	 * This value represents a 4 dimensional {@code short} tuple.
	 */
	TUP4S(4 * 2),
	
	/**
	 * This value represents a 2 dimensional {@code int} tuple.
	 */
	TUP2I(2 * 4),
	
	/**
	 * This value represents a 3 dimensional {@code int} tuple.
	 */
	TUP3I(3 * 4),
	
	/**
	 * This value represents a 4 dimensional {@code int} tuple.
	 */
	TUP4I(4 * 4),
	
	/**
	 * This value represents a 2 dimensional {@code long} tuple.
	 */
	TUP2L(2 * 8),
	
	/**
	 * This value represents a 3 dimensional {@code long} tuple.
	 */
	TUP3L(3 * 8),
	
	/**
	 * This value represents a 4 dimensional {@code long} tuple.
	 */
	TUP4L(4 * 8),
	
	/**
	 * This value represents a 2 dimensional {@code float} tuple.
	 */
	TUP2F(2 * 4),
	
	/**
	 * This value represents a 3 dimensional {@code float} tuple.
	 */
	TUP3F(3 * 4),
	
	/**
	 * This value represents a 4 dimensional {@code float} tuple.
	 */
	TUP4F(4 * 4),
	
	/**
	 * This value represents a 2 dimensional {@code double} tuple.
	 */
	TUP2D(2 * 8),
	
	/**
	 * This value represents a 3 dimensional {@code double} tuple.
	 */
	TUP3D(3 * 8),
	
	/**
	 * This value represents a 4 dimensional {@code double} tuple.
	 */
	TUP4D(4 * 8),
	;
	
	/**
	 * This private member contains the length of the data type in bytes.
	 */
	private final int bytes;
	
	/**
	 * Creates a new instance of the data type.
	 * 
	 * @param bytes The length of the data type in bytes.
	 */
	private CoreType(int bytes)
	{
		this.bytes = bytes;
	}
	
	/** {@inheritDoc} */
	@Override
	public int bytesi()
	{
		return this.bytes;
	}
	
	/** {@inheritDoc} */
	@Override
	public int bytesi(int multiplier)
	{
		return this.bytes * multiplier;
	}
	
	/** {@inheritDoc} */
	@Override
	public long bytesl()
	{
		return this.bytes;
	}
	
	/** {@inheritDoc} */
	@Override
	public long bytesl(long multiplier)
	{
		return this.bytes * multiplier;
	}
}
