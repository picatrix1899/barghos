package org.barghos.tuple.api.t3;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This interface provides the common functions and methods for {@link BigInteger} tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3bigiC extends Tup3bigiR, TupbigiC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigiC setX(BigInteger x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigiC setY(BigInteger y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigiC setZ(BigInteger z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3bigiR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bigiR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigiC set(Tup3bigiR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC set(BigInteger value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigiC set(BigInteger x, BigInteger y, BigInteger z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC set(@MinLength(3) TupbigiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC setByIndex(@IntValueRange(min=0, max=2) int index, BigInteger value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigiC setArray(@MinLength(3) BigInteger... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigiC copy();
}