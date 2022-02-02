package org.barghos.core.api.tuple2;

/**
 * This interface grants most basic readonly access to any 2-dimensional object tuples.
 * This layer exists for creating anonymous implementations in api-klasses to
 * allow the api to be entirely separated from the implementations.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface TupBase2oR<X,Y>
{
	/**
	 * Returns the x value from the tuple.
	 * 
	 * @return The x value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	X getX();
	
	/**
	 * Returns the y value from the tuple.
	 * 
	 * @return The y value from the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	Y getY();
	
	/**
	 * Returns true if all the components are valid.
	 * What values are considered valid or invalid depends on the tuple type.
	 * 
	 * @return True if all the components are valid.
	 * 
	 * @since 1.0.0.0
	 */
	default boolean isValid()
	{
		return getX() != null &&
				getY() != null;
	}
	
	/**
	 * Creates a new anonymous implementation of the {@link TupBase2oR} interface with the given values.
	 * 
	 * @param <X> The type of the x component.
	 * @param <Y> The type of the y component.
	 * 
	 * @param x The value for the x component.
	 * @param y The value for the y component.
	 * 
	 * @return The new anonymous implementation of the {@link TupBase2oR} interface.
	 * 
	 * @since 1.0.0.0
	 */
	public static <X,Y> TupBase2oR<X,Y> of(final X x, final Y y)
	{
		return new TupBase2oR<>() {
			/** {@inheritDoc} */
			@Override
			public X getX()
			{
				return x;
			}
			
			/** {@inheritDoc} */
			@Override
			public Y getY()
			{
				return y;
			}
		};
	}
}