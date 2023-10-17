package org.barghos.util.tuple.doubles;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.doubles.Tup3dC;

/**
 * This interface provides the common functions and methods for double tuples with three dimensions.
 */
public interface Tup3dC extends Tup3dR, TupdC
{
	/** {@inheritDoc}} */
	@Override
	Tup3dC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC createNew(Tup3dR t)
	{
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC createNew(@MinLength(3) double[] t)
	{
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC createNew(double value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3dC createNew(double v0, double v1, double v2);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3dC v0(double v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3dC v1(double v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3dC v2(double v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3dR}.
	 * 
	 * @param t An existing implementation of {@link Tup3dR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3dC set(Tup3dR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC set(double value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return The current tuple.
	 */
	default Tup3dC set(double v0, double v1, double v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC set(@MinLength(3) TupdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC setByIndex(@IntValueRange(min=0, max=2) int index, double value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			case 2: return v2(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3dC setArray(@MinLength(3) double... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3dC copy();
}