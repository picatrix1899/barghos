package org.barghos.math.api.vector;

import static org.barghos.core.api.tuple.TupleConstants.*;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2oBase;
import org.barghos.core.api.tuple2.Tup2oR;
import org.barghos.core.api.util.function.GenericFunction2;

/**
 * This interface grants readonly access to any 2-dimensional float vector.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface Vec2fR extends Tup2fR
{
	/**
	 * Returns the reciprocal length of the vector.
	 * It doesn't account for zero-length vectors and will in such case throw an {@link ArithmeticException}
	 * as this would result in a division by zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector.
	 * 
	 * @throws
	 * ArithmeticException Thrown when it is a zero-length vector.
	 */
	default float reciprocalLength()
	{
		return 1.0f / length();
	}
	
	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * Due to floating-point-errors it might still throw an {@link ArithmeticException} when
	 * the length is too close to zero.
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 * 
	 * @throws
	 * ArithmeticException Might be thrown when the length is to close to zero.
	 */
	default float reciprocalLengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return reciprocalLength();
	}
	
	/**
	 * Returns the reciprocal length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * 1 / |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The reciprocal length of the vector or zero if it is a zero-length vector.
	 */
	default float reciprocalLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return reciprocalLength();
	}
	
	/**
	 * Returns the length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector.
	 */
	default float length()
	{
		return (float)Math.sqrt(squaredLength());
	}
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	default float lengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return length();
	}
	
	/**
	 * Returns the length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The length of the vector or zero if it is a zero-length vector.
	 */
	default float lengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return length();
	}
	
	/**
	 * Returns the squared length of the vector.
	 * It doesn't account for zero-length vectors.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector.
	 */
	default float squaredLength()
	{
		float x = getX();
		float y = getY();
		
		return Math.fma(x, x, y * y);
	}
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are exactly zero.
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	default float squaredLengthSafe()
	{
		if(isZero()) return 0.0f;
		
		return squaredLength();
	}
	
	/**
	 * Returns the squared length of the vector.
	 * If the vector is a zero-length vector the result will be zero.
	 * It determines a zero-length by checking if all components are within the margin defined by
	 * zero plus-minus the given tolerance inclusive (-tolerance <= value <= tolerance).
	 * 
	 * <p>
	 * Operation:
	 * |v|²
	 * 
	 * @param tolerance The tolerance for defining the margin around zero.
	 * 
	 * @return The squared length of the vector or zero if it is a zero-length vector.
	 */
	default float squaredLengthSafeWithMargin(float tolerance)
	{
		if(isZeroWithMargin(tolerance)) return 0.0f;
		
		return squaredLength();
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The smallest value of the components and the index of the corresponding component.
	 */
	default Tup2oR<Float,Integer> min()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return Tup2oR.of(value, index);
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	default <T extends Tup2oBase<Float,Integer>> T minR(T res)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the smallest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	default <T> T minR(GenericFunction2<Float,Integer,T> func)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the smallest value of the components and returns it.
	 * 
	 * @return The smallest value of the components.
	 */
	default float minValue()
	{
		return Math.min(getX(), getY());
	}
	
	/**
	 * Determines the smallest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the smallest component.
	 */
	default int minComponent()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y < value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return index;
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * The returned tuple is immutable.
	 * 
	 * @return The greatest value of the components and the index of the corresponding component.
	 */
	default Tup2oR<Float,Integer> max()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return Tup2oR.of(value, index);
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version utilizes a query parameter that receives the result and will be returned.
	 * 
	 * @param res The query parameter for the result.
	 * 
	 * @return The instance from the res parameter with the result.
	 */
	default <T extends Tup2oBase<Float,Integer>> T maxR(T res)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		res.set(value, index);
		
		return res;
	}
	
	/**
	 * Determines the greatest value of the components and returns the value and the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * This version provides the result to the given functional interface implementation and returns the result of that call.
	 * 
	 * @param func The functional interface implementation to call with the result.
	 * 
	 * @return The returned result from the functional interface implementation.
	 */
	default <T> T maxR(GenericFunction2<Float,Integer,T> func)
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return func.apply(value, index);
	}
	
	/**
	 * Determines the greatest value of the components and returns it.
	 * 
	 * @return The greatest value of the components.
	 */
	default float maxValue()
	{
		return Math.max(getX(), getY());
	}
	
	/**
	 * Determines the greatest value of the componensts and returns the index of the component.
	 * The index returned is limited to the range of 0 to getDimensions() - 1.
	 * If two or more components have the same value the first index will be returned.
	 * 
	 * @return The index of the greatest component.
	 */
	default int maxComponent()
	{
		float x = getX();
		float y = getY();
		
		float value = x;
		int index = COMP_X;
		
		if(y > value)
		{
			value = y;
			index = COMP_Y;
		}
		
		return index;
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Vec2fR} with the given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Vec2fR of(final float x, final float y)
	{
		return new Vec2fR() {
			public float getX()
			{
				return x;
			}

			public float getY()
			{
				return y;
			}
		};
	}
	
	/**
	 * Creates a new anonymous implementation instance of the interface {@link Vec2fR} with the normalized given values.
	 * As the resulting instance is just a minimal implementation of the interface it does not provide clone,
	 * equals, hashCode or toString operations.
	 * 
	 * @param x The value of the x component.
	 * @param y The value of the y component.
	 * 
	 * @return The anonymous implementation instance.
	 */
	public static Vec2fR ofNormalized(final float x, final float y)
	{
		float length = (float)Math.sqrt(Math.fma(x, x, y * y));
		final float _x = x / length;
		final float _y = y / length;
		
		return new Vec2fR() {
			public float getX()
			{
				return _x;
			}

			public float getY()
			{
				return _y;
			}
		};
	}
}
