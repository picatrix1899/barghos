package org.barghos.tuple.api.t4;

/**
 * This interface provides the common functions and methods for object tuples with four dimensions.
 * 
 * @param <X> The type of the x component.
 * @param <Y> The type of the y component.
 * @param <Z> The type of the z component.
 * @param <W> The type of the w component.
 * 
 * @author picatrix1899
 */
public interface Tup4oC<X,Y,Z,W> extends Tup4oR<X,Y,Z,W>
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4oC<X,Y,Z,W> setX(X x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4oC<X,Y,Z,W> setY(Y y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4oC<X,Y,Z,W> setZ(Z z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4oC<X,Y,Z,W> setW(W w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4oR}.
	 * 
	 * @param t An existing implementation of {@link Tup4oR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4oC<X,Y,Z,W> set(Tup4oR<X,Y,Z,W> t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * @param w The new value of the w component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4oC<X,Y,Z,W> set(X x, Y y, Z z, W w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4oC<X,Y,Z,W> copy();
}