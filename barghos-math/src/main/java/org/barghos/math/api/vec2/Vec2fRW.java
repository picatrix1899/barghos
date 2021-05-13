package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;

/**
 * This interface grants read and write access to any 2-dimensional mathematical float vector.
 * 
 * @author picatrix1899
 */
public interface Vec2fRW extends Vec2fR, Vec2fW, Tup2fRW
{
	@Override
	Vec2fRW setX(float x);
	
	@Override
	Vec2fRW setY(float y);
	
	@Override
	Vec2fRW set(Tup2fR t);
	
	@Override
	Vec2fRW set(float value);
	
	@Override
	Vec2fRW set(float x, float y);
	
	@Override
	default Vec2fRW getNewInstance(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstance(t);
	}
	
	@Override
	default Vec2fRW getNewInstance(float value)
	{
		return (Vec2fRW)Vec2fR.super.getNewInstance(value);
	}
	
	@Override
	Vec2fRW getNewInstance(float x, float y);
	
	@Override
	default Vec2fRW addN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.addN(t);
	}
	
	@Override
	default Vec2fRW addN(float value)
	{
		return (Vec2fRW)Vec2fR.super.addN(value);
	}
	
	@Override
	default Vec2fRW addN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.addN(x, y);
	}
	
	@Override
	default Vec2fRW subN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.subN(t);
	}
	
	@Override
	default Vec2fRW subN(float value)
	{
		return (Vec2fRW)Vec2fR.super.subN(value);
	}
	
	@Override
	default Vec2fRW subN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.subN(x, y);
	}
	
	@Override
	default Vec2fRW mulN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.mulN(t);
	}
	
	@Override
	default Vec2fRW mulN(float value)
	{
		return (Vec2fRW)Vec2fR.super.mulN(value);
	}
	
	@Override
	default Vec2fRW mulN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.mulN(x, y);
	}
	
	@Override
	default Vec2fRW divN(Tup2fR t)
	{
		return (Vec2fRW)Vec2fR.super.mulN(t);
	}
	
	@Override
	default Vec2fRW divN(float value)
	{
		return (Vec2fRW)Vec2fR.super.mulN(value);
	}
	
	@Override
	default Vec2fRW divN(float x, float y)
	{
		return (Vec2fRW)Vec2fR.super.mulN(x, y);
	}
	
	@Override
	default Vec2fRW normalizeN()
	{
		return (Vec2fRW)Vec2fR.super.normalizeN();
	}
	
	@Override
	default Vec2fRW safeNormalizeN()
	{
		return (Vec2fRW)Vec2fR.super.safeNormalizeN();
	}
	
	@Override
	default Vec2fRW safeTrNormalizeN(float tolerance)
	{
		return (Vec2fRW)Vec2fR.super.safeTrNormalizeN(tolerance);
	}
	
	@Override
	default Vec2fRW invertN()
	{
		return (Vec2fRW)Vec2fR.super.invertN();
	}
	
	@Override
	default Vec2fRW reciprocalN()
	{
		return (Vec2fRW)Vec2fR.super.reciprocalN();
	}
	
	@Override
	default Vec2fRW safeReciprocalN()
	{
		return (Vec2fRW)Vec2fR.super.safeReciprocalN();
	}
	
	@Override
	default Vec2fRW safeTrReciprocalN(float tolerance)
	{
		return (Vec2fRW)Vec2fR.super.safeTrReciprocalN(tolerance);
	}
	
	/**
	 * Adds the tuple t to the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + t.x, vector.y + t.y)
	 * 
	 * @param t The tuple to add to the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW add(Tup2fR t)
	{
		return add(t.getX(), t.getY());
	}
	
	/**
	 * Adds a single value to the components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + value, vector.y + value)
	 * 
	 * @param value The value to add to the components.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW add(float value)
	{
		return add(value, value);
	}
	
	/**
	 * Adds the x and y parameter to their corresponding components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x + x, vector.y + y)
	 * 
	 * @param x The value to add to the x component of the current vector.
	 * @param y The value to add to the y component of the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW add(float x, float y)
	{
		return set(getX() + x, getY() + y);
	}
	
	/**
	 * Subtracts the tuple t from the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - t.x, vector.y - t.y)
	 * 
	 * @param t The tuple to subtract from the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW sub(Tup2fR t)
	{
		return sub(t.getX(), t.getY());
	}
	
	/**
	 * Subtracts a single value from the components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - value, vector.y - value)
	 * 
	 * @param value The value to add to the components.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW sub(float value)
	{
		return sub(value, value);
	}
	
	/**
	 * Subtracts the x and y parameter from their corresponding components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x - x, vector.y - y)
	 * 
	 * @param x The value to subtract from the x component of the current vector.
	 * @param y The value to subtract from the y component of the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW sub(float x, float y)
	{
		return set(getX() - x, getY() - y);
	}
	
	/**
	 * Multiplies the tuple t with the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * t.x, vector.y * t.y)
	 * 
	 * @param t The tuple to multiply with the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW mul(Tup2fR t)
	{
		return mul(t.getX(), t.getY());
	}
	
	/**
	 * Multiplies a single value with the components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * value, vector.y * value)
	 * 
	 * @param value The value to multiply with the components.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW mul(float value)
	{
		return mul(value, value);
	}
	
	/**
	 * Multiplies the x and y parameter with their corresponding components in the current vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x * x, vector.y * y)
	 * 
	 * @param x The value to multiply with the x component of the current vector.
	 * @param y The value to multiply with the y component of the current vector.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW mul(float x, float y)
	{
		return set(getX() * x, getY() * y);
	}
	
	/**
	 * Divides the current vector by a tuple t.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / t.x, vector.y / t.y)
	 * 
	 * @param t The tuple to divide the current vector by.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW div(Tup2fR t)
	{
		return div(t.getX(), t.getY());
	}
	
	/**
	 * Divides the components in the current vector by a single value.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / value, vector.y / value)
	 * 
	 * @param value The value to divide the components by.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW div(float value)
	{
		return div(value, value);
	}
	
	/**
	 * Divides the components in the current vector by their corresponding parameters.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: (vector.x / x, vector.y / y)
	 * 
	 * @param x The value to divide the x component of the current vector by.
	 * @param y The value to divide the y component of the current vector by.
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW div(float x, float y)
	{
		return set(getX() / x, getY() / y);
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW normalize()
	{
		float r = reciprocalLength();
		
		return set(getX() * r, getY() * r);
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components to zero.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW safeNormalize()
	{
		if(isZero()) return set(0.0f);
		
		return normalize();
	}
	
	/**
	 * Normalizes the vector, therefore dividing the vector by its length to get the vector
	 * with its original direction but with a length of ~1.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will set all components to zero.
	 * 
	 * <p>
	 * Operation: v / |v|
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW safeTrNormalize(float tolerance)
	{
		if(isZero(tolerance)) return set(0.0f);
		
		return normalize();
	}
	
	/**
	 * Inverts (negates) the vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * Operation: -v
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW invert()
	{
		return set(-getX(), -getY());
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This does not treat zero length vectors.
	 * This can cause undesired results or arithmetic exceptions.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW reciprocal()
	{
		return set(1.0f / getX(), 1.0f / getY());
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are exactly zero this will set all components to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW safeReciprocal()
	{
		if(isZero()) return set(0.0f);
		
		return reciprocal();
	}
	
	/**
	 * Calculates the reciprocals of each component of the vector.
	 * This operation alters the current vector.
	 * 
	 * <p>
	 * This treats zero length vectors.
	 * If all components are within an inclusive tolerance around zero (positive and negative),
	 * this will set all components to zero.
	 * 
	 * <p>
	 * Operation: ( 1 / v.x, 1 / v.y )
	 * 
	 * @param tolerance The inclusive tolerance around zero (positive and negative).
	 * 
	 * @return The altered vector.
	 */
	default Vec2fRW safeTrReciprocal(float tolerance)
	{
		if(isZero(tolerance)) return set(0.0f);
		
		return reciprocal();
	}
}
