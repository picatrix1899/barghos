package org.barghos.tuple.api.t3;

/**
 * This interface provides the common functions and methods for object tuples with three dimensions.
 * 
 * @param <X> The type of the x component.
 * @param <Y> The type of the y component.
 * @param <Z> The type of the z component.
 * 
 * @author picatrix1899
 */
public interface Tup3oC<X,Y,Z> extends Tup3oR<X,Y,Z>
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3oC<X,Y,Z> setX(X x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3oC<X,Y,Z> setY(Y y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3oC<X,Y,Z> setZ(Z z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3oR}.
	 * 
	 * @param t An existing implementation of {@link Tup3oR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3oC<X,Y,Z> set(Tup3oR<X,Y,Z> t)
	{
		return set(t.getX(), t.getY(), t.getZ());
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
	default Tup3oC<X,Y,Z> set(X x, Y y, Z z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3oC<X,Y,Z> copy();
}