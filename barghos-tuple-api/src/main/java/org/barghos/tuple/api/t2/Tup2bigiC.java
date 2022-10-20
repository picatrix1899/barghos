package org.barghos.tuple.api.t2;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupbigiC;
import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This interface provides the common functions and methods for {@link BigInteger} tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2bigiC extends Tup2bigiR, TupbigiC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bigiC setX(BigInteger x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bigiC setY(BigInteger y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bigiR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bigiR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bigiC set(Tup2bigiR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC set(BigInteger value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bigiC set(BigInteger x, BigInteger y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC set(@MinLength(2) TupbigiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC setByIndex(@IntValueRange(min=0, max=1) int index, BigInteger value)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC setArray(@MinLength(2) BigInteger... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bigiC copy();
}