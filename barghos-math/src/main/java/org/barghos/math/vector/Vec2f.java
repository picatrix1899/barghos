//package org.barghos.math.vector;
//
//import org.barghos.core.api.tuple.TupfR;
//import org.barghos.core.api.tuple2.Tup2fR;
//import org.barghos.math.api.vector.Vec2fC;
//import org.barghos.math.api.vector.Vec2fR;
//
///**
// * This class represents a 2-dimensional float vector.
// * 
// * @author picatrix1899
// */
//public class Vec2f implements Vec2fC
//{
//	/**
//	 * The x component.
//	 */
//	public float x;
//	
//	/**
//	 * The y component.
//	 */
//	public float y;
//	
//	/**
//	 * Creates a new instance with all components set to 0.
//	 */
//	public Vec2f()
//	{
//		set(0);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
//	 */
//	public Vec2f(TupfR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance from an existing instance of {@link Tup2fR} and adopts the values.
//	 * 
//	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
//	 */
//	public Vec2f(Tup2fR t)
//	{
//		set(t);
//	}
//	
//	/**
//	 * Creates a new instance with all values set to a single value.
//	 * 
//	 * @param value The value used as the initial value for all values of the tuple.
//	 */
//	public Vec2f(float value)
//	{
//		set(value);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param v The x and y values as an array.
//	 */
//	public Vec2f(float[] v)
//	{
//		setArray(v);
//	}
//	
//	/**
//	 * Creates a new instance with the values set to the corresponding parameters.
//	 * 
//	 * @param x The initial x value of the tuple.
//	 * @param y The initial y value of the tuple.
//	 */
//	public Vec2f(float x, float y)
//	{
//		set(x, y);
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public float getX()
//	{
//		return this.x;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public float getY()
//	{
//		return this.y;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Vec2fC setX(float x)
//	{
//		this.x = x;
//		
//		return this;
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Vec2fC setY(float y)
//	{
//		this.y = y;
//		
//		return this;
//	}
//
//	/** {@inheritDoc}} */
//	@Override
//	public int hashCode()
//	{
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Float.floatToIntBits(getX());
//		result = prime * result + Float.floatToIntBits(getY());
//		return result;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(this == obj) return true;
//		if(obj == null) return false;
//		
//		if(obj instanceof Vec2fR)
//		{
//			Vec2fR other = (Vec2fR) obj;
//			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
//			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof Tup2fR)
//		{
//			Tup2fR other = (Tup2fR) obj;
//			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
//			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
//			
//			return true;
//		}
//		
//		if(obj instanceof TupfR)
//		{
//			TupfR other = (TupfR) obj;
//			if(getDimensions() != other.getDimensions()) return false;
//			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getByIndex(0))) return false;
//			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getByIndex(1))) return false;
//			
//			return true;
//		}
//		
//		return false;
//	}
//	
//	/** {@inheritDoc}} */
//	@Override
//	public String toString()
//	{
//		return "vec2f(x=" + getX() + ", y=" + getY() + ")";
//	}
//	
//	/** {@inheritDoc} */
//	@Override
//	public Vec2f clone()
//	{
//		return new Vec2f(this);
//	}
//}
