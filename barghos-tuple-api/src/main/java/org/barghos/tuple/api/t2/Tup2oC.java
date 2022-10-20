package org.barghos.tuple.api.t2;

/**
 * This interface provides the common functions and methods for object tuples with two dimensions.
 * 
 * @param <X> The type of the x component.
 * @param <Y> The type of the y component.
 * 
 * @author picatrix1899
 */
public interface Tup2oC<X,Y> extends Tup2oR<X,Y>
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2oC<X,Y> setX(X x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2oC<X,Y> setY(Y y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2oR}.
	 * 
	 * @param t An existing implementation of {@link Tup2oR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2oC<X,Y> set(Tup2oR<X,Y> t)
	{
		return set(t.getX(), t.getY());
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2oC<X,Y> set(X x, Y y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2oC<X,Y> copy();
}