package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupboC;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This interface provides the common functions and methods for boolean tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3boC extends Tup3boR, TupboC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setX(boolean x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setY(boolean y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3boC setZ(boolean z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3boR}.
	 * 
	 * @param t An existing implementation of {@link Tup3boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3boC set(Tup3boR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(boolean value)
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
	default Tup3boC set(boolean x, boolean y, boolean z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC set(@MinLength(3) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3boC setByIndex(@IntValueRange(min=0, max=2) int index, boolean value)
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
	default Tup3boC setArray(@MinLength(3) boolean... v)
	{
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3boC copy();
}